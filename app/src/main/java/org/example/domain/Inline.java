package org.example.domain;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Inline is the class that wraps all inline logic.
 */
public class Inline {
    private Map<Integer, Restaurant> restaurants;
    private Map<Integer, User> users;
    private Map<Integer, Registration> registrations;

    public Inline() {
        restaurants = new HashMap<>();
        users = new HashMap<>();
        registrations = new HashMap<>();
    }

    // returns registration id
    public int inline(int restaurantId, String telephone, String email, int numOfCustomers) {
        // FIXME: auto-incr
        var id = 3;
        Registration reg = new Registration(id, restaurantId, telephone, email, numOfCustomers);
        registrations.put(id, reg);
        return reg.getId();
    }

    public Map<Integer, Restaurant> getRestaurants() {
        return restaurants;
    }

    public void setRestaurants(Map<Integer, Restaurant> restaurants) {
        this.restaurants = restaurants;
    }

    public Map<Integer, User> getUsers() {
        return users;
    }

    public void setUsers(Map<Integer, User> users) {
        this.users = users;
    }

    public Map<Integer, Registration> getRegistrations() {
        return registrations;
    }

    public void setRegistrations(Map<Integer, Registration> registrations) {
        this.registrations = registrations;
    }

    public InlineStatus checkInlineStatus(int regId) throws NoSuchElementException {
        if (!registrations.containsKey(regId)) {
            // FIXME: how to deal with not found error
            throw new NoSuchElementException(String.format("registration [id=%d] not found", regId));
        }
        Registration registration = registrations.get(regId);
        // find the position of this registration in registration.restaurant_id;
        List<Registration> queueOfRestaurant = registrations.values().stream().filter(
                entry -> entry.getRestaurantId() == registration.getRestaurantId()
        ).sorted((e1, e2) -> {
            return Integer.compare(e1.getId(), e2.getId());
        }).toList();

        int position = queueOfRestaurant.indexOf(registration);
        return new InlineStatus(registration, position);
    }
}
