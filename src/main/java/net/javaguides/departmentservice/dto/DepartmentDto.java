package net.javaguides.departmentservice.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DepartmentDto {
    private Long id;
    @NotNull(message = "department name cannot be null")
    private String departmentName;
    @NotNull(message = "department description cannot be null")
    private String departmentDescription;
    @NotNull(message = "department code cannot be null")
    private String departmentCode;
}
