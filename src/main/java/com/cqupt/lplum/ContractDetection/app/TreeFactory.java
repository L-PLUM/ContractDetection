package com.cqupt.lplum.ContractDetection.app;

import com.cqupt.lplum.ContractDetection.SearchableTree;

import java.nio.file.Path;

/**
 *
 */
public interface TreeFactory {

    /**
     * @param path source
     * @return tree
     */
    SearchableTree tree(Path path);
}
