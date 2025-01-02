package co.ke.collengine.open_api.todo.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.*;

import java.util.UUID;


public class ToDoDetailsResponseDto {

    @Schema(description = "The id of the TODO", example = "00000000-00000000-00000000-00000000")
    private UUID id;

    @Schema(description = "The title of the TODO", example = "Clean House")
    private String title;

    @Schema(description = "The status of the TODO", example = "true")
    private boolean done;

    public ToDoDetailsResponseDto(UUID id, String title, boolean done) {
        this.id = id;
        this.title = title;
        this.done = done;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}
