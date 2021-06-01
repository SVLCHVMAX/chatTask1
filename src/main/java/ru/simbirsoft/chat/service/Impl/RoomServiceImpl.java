package ru.simbirsoft.chat.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.simbirsoft.chat.model.Room;
import ru.simbirsoft.chat.repository.RoomRepository;
import ru.simbirsoft.chat.service.RoomService;

import java.util.List;

@Service
public class RoomServiceImpl implements RoomService {

    private final RoomRepository roomRepository;

    @Autowired
    public RoomServiceImpl(RoomRepository roomRepository) {
        this.roomRepository = roomRepository;
    }

    @Override
    public List<Room> findAll() {
        return roomRepository.findAll();
    }

    @Override
    public Room findById(long id) {
        return roomRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Room room) {
        roomRepository.save(room);
    }

    @Override
    public void deleteById(long id) {
        roomRepository.deleteById(id);
    }
}
