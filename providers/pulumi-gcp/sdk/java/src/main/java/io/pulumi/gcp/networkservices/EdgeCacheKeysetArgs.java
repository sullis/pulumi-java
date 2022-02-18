// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.networkservices;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.networkservices.inputs.EdgeCacheKeysetPublicKeyArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EdgeCacheKeysetArgs extends io.pulumi.resources.ResourceArgs {

    public static final EdgeCacheKeysetArgs Empty = new EdgeCacheKeysetArgs();

    /**
     * A human-readable description of the resource.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Set of label tags associated with the EdgeCache resource.
     * 
     */
    @InputImport(name="labels")
    private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    /**
     * Name of the resource; provided by the client when the resource is created.
     * The name must be 1-64 characters long, and match the regular expression [a-zA-Z][a-zA-Z0-9_-]* which means the first character must be a letter,
     * and all following characters must be a dash, underscore, letter or digit.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
    private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * An ordered list of Ed25519 public keys to use for validating signed requests.
     * You must specify at least one (1) key, and may have up to three (3) keys.
     * Ed25519 public keys are not secret, and only allow Google to validate a request was signed by your corresponding private key.
     * You should ensure that the private key is kept secret, and that only authorized users can add public keys to a keyset.
     * Structure is documented below.
     * 
     */
    @InputImport(name="publicKeys", required=true)
    private final Input<List<EdgeCacheKeysetPublicKeyArgs>> publicKeys;

    public Input<List<EdgeCacheKeysetPublicKeyArgs>> getPublicKeys() {
        return this.publicKeys;
    }

    public EdgeCacheKeysetArgs(
        @Nullable Input<String> description,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        Input<List<EdgeCacheKeysetPublicKeyArgs>> publicKeys) {
        this.description = description;
        this.labels = labels;
        this.name = name;
        this.project = project;
        this.publicKeys = Objects.requireNonNull(publicKeys, "expected parameter 'publicKeys' to be non-null");
    }

    private EdgeCacheKeysetArgs() {
        this.description = Input.empty();
        this.labels = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.publicKeys = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EdgeCacheKeysetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private Input<List<EdgeCacheKeysetPublicKeyArgs>> publicKeys;

        public Builder() {
    	      // Empty
        }

        public Builder(EdgeCacheKeysetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.publicKeys = defaults.publicKeys;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setLabels(@Nullable Input<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setLabels(@Nullable Map<String,String> labels) {
            this.labels = Input.ofNullable(labels);
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

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setPublicKeys(Input<List<EdgeCacheKeysetPublicKeyArgs>> publicKeys) {
            this.publicKeys = Objects.requireNonNull(publicKeys);
            return this;
        }

        public Builder setPublicKeys(List<EdgeCacheKeysetPublicKeyArgs> publicKeys) {
            this.publicKeys = Input.of(Objects.requireNonNull(publicKeys));
            return this;
        }

        public EdgeCacheKeysetArgs build() {
            return new EdgeCacheKeysetArgs(description, labels, name, project, publicKeys);
        }
    }
}
