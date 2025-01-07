package com.ms.Jpa2501.domain.Post;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional
public class PostService {
    private final PostRepository postRepository;

    public Post getPost(Long id) {
        return postRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Post not found"));
    }

    public List<Post> findByUsername(String username) {
        postRepository.findById(1L);
        postRepository.findByUsername(username);
        return postRepository.findByUsername(username);
    }

    @SneakyThrows
    public Optional<Post> findWithShareLockById(Long id) {
        postRepository.findWithShareLockById(id);
        Thread.sleep(10000);
        return postRepository.findWithShareLockById(id);
    }
}
