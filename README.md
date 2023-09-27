# jpa-one-to-one-uni

# JPA/Hibernate Advanced Mappings

Bi-Directional Notes:

When using Lombok -> If @Data or @ToString annotation is used at the Entity class of JPA, it is necessary to keep in mind that it tends to the circular reference.

NOTE: It may be better to NOT use @Data at all with JPA entities
