package com.example.one2many.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.one2many.model.Event;
public interface EventRepository extends JpaRepository<Event, Long> {
}