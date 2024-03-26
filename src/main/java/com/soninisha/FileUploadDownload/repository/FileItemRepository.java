package com.soninisha.FileUploadDownload.repository;

import com.soninisha.FileUploadDownload.model.FileItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FileItemRepository extends JpaRepository<FileItem, Integer> {
    Optional<FileItem> findByFileName(String fileName);

  
}
