package com.dsinnovators.devprofilesbackend.github.entities;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class RepositoryTopicConnection {
    List<RepositoryTopic> nodes = new ArrayList<>();
}
