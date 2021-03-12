package ch.noser.uek223.domain.user.dto;
import ch.noser.uek223.domain.role.dto.RoleDTO;
import java.util.Set;
import java.util.UUID;
public class UserDTO {
  private UUID id;
  private String firstName;
  private String lastName;
  private String email;
  private Set<RoleDTO> roles;
  public UserDTO(){
  }
  public UserDTO(UUID id, String firstName, String lastName, String email, Set<RoleDTO> roles) {
    this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
    this.email = email;
    this.roles = roles;
  }

  public UserDTO(UUID id) {
  }

  public UUID getId() {
    return id;
  }
  public UserDTO setId(UUID id) {
    this.id = id;
    return this;
  }
  public String getFirstName() {
    return firstName;
  }
  public UserDTO setFirstName(String firstName) {
    this.firstName = firstName;
    return this;
  }
  public String getLastName() {
    return lastName;
  }
  public UserDTO setLastName(String lastName) {
    this.lastName = lastName;
    return this;
  }
  public String getEmail() {
    return email;
  }
  public UserDTO setEmail(String email) {
    this.email = email;
    return this;
  }
  public Set<RoleDTO> getRoles() {
    return roles;
  }
  public UserDTO setRoles(Set<RoleDTO> roles) {
    this.roles = roles;
    return this;
  }
}