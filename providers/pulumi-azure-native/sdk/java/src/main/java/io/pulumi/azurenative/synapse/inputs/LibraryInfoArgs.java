// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Library/package information of a Big Data pool powered by Apache Spark
 * 
 */
public final class LibraryInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final LibraryInfoArgs Empty = new LibraryInfoArgs();

    /**
     * Storage blob container name.
     * 
     */
    @InputImport(name="containerName")
      private final @Nullable Input<String> containerName;

    public Input<String> getContainerName() {
        return this.containerName == null ? Input.empty() : this.containerName;
    }

    /**
     * Name of the library.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Storage blob path of library.
     * 
     */
    @InputImport(name="path")
      private final @Nullable Input<String> path;

    public Input<String> getPath() {
        return this.path == null ? Input.empty() : this.path;
    }

    /**
     * Type of the library.
     * 
     */
    @InputImport(name="type")
      private final @Nullable Input<String> type;

    public Input<String> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public LibraryInfoArgs(
        @Nullable Input<String> containerName,
        @Nullable Input<String> name,
        @Nullable Input<String> path,
        @Nullable Input<String> type) {
        this.containerName = containerName;
        this.name = name;
        this.path = path;
        this.type = type;
    }

    private LibraryInfoArgs() {
        this.containerName = Input.empty();
        this.name = Input.empty();
        this.path = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LibraryInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> containerName;
        private @Nullable Input<String> name;
        private @Nullable Input<String> path;
        private @Nullable Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(LibraryInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerName = defaults.containerName;
    	      this.name = defaults.name;
    	      this.path = defaults.path;
    	      this.type = defaults.type;
        }

        public Builder setContainerName(@Nullable Input<String> containerName) {
            this.containerName = containerName;
            return this;
        }

        public Builder setContainerName(@Nullable String containerName) {
            this.containerName = Input.ofNullable(containerName);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setPath(@Nullable Input<String> path) {
            this.path = path;
            return this;
        }

        public Builder setPath(@Nullable String path) {
            this.path = Input.ofNullable(path);
            return this;
        }

        public Builder setType(@Nullable Input<String> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = Input.ofNullable(type);
            return this;
        }
        public LibraryInfoArgs build() {
            return new LibraryInfoArgs(containerName, name, path, type);
        }
    }
}