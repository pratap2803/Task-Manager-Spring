package org.taskmanager.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.taskmanager.entities.NoteEntity;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CreateNoteResponseDTO {
    private Integer taskId;
    private NoteEntity note;
}
