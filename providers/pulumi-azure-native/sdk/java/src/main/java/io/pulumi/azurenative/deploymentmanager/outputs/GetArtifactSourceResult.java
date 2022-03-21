// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.deploymentmanager.outputs;

import io.pulumi.azurenative.deploymentmanager.outputs.SasAuthenticationResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetArtifactSourceResult {
    /**
     * The path from the location that the 'authentication' property [say, a SAS URI to the blob container] refers to, to the location of the artifacts. This can be used to differentiate different versions of the artifacts. Or, different types of artifacts like binaries or templates. The location referenced by the authentication property concatenated with this optional artifactRoot path forms the artifact source location where the artifacts are expected to be found.
     * 
     */
    private final @Nullable String artifactRoot;
    /**
     * The authentication method to use to access the artifact source.
     * 
     */
    private final SasAuthenticationResponse authentication;
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * The geo-location where the resource lives
     * 
     */
    private final String location;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * The type of artifact source used.
     * 
     */
    private final String sourceType;
    /**
     * Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetArtifactSourceResult(
        @CustomType.Parameter("artifactRoot") @Nullable String artifactRoot,
        @CustomType.Parameter("authentication") SasAuthenticationResponse authentication,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("sourceType") String sourceType,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type) {
        this.artifactRoot = artifactRoot;
        this.authentication = authentication;
        this.id = id;
        this.location = location;
        this.name = name;
        this.sourceType = sourceType;
        this.tags = tags;
        this.type = type;
    }

    /**
     * The path from the location that the 'authentication' property [say, a SAS URI to the blob container] refers to, to the location of the artifacts. This can be used to differentiate different versions of the artifacts. Or, different types of artifacts like binaries or templates. The location referenced by the authentication property concatenated with this optional artifactRoot path forms the artifact source location where the artifacts are expected to be found.
     * 
    */
    public Optional<String> getArtifactRoot() {
        return Optional.ofNullable(this.artifactRoot);
    }
    /**
     * The authentication method to use to access the artifact source.
     * 
    */
    public SasAuthenticationResponse getAuthentication() {
        return this.authentication;
    }
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The geo-location where the resource lives
     * 
    */
    public String getLocation() {
        return this.location;
    }
    /**
     * The name of the resource
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The type of artifact source used.
     * 
    */
    public String getSourceType() {
        return this.sourceType;
    }
    /**
     * Resource tags.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetArtifactSourceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String artifactRoot;
        private SasAuthenticationResponse authentication;
        private String id;
        private String location;
        private String name;
        private String sourceType;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetArtifactSourceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.artifactRoot = defaults.artifactRoot;
    	      this.authentication = defaults.authentication;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.sourceType = defaults.sourceType;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder artifactRoot(@Nullable String artifactRoot) {
            this.artifactRoot = artifactRoot;
            return this;
        }
        public Builder authentication(SasAuthenticationResponse authentication) {
            this.authentication = Objects.requireNonNull(authentication);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder sourceType(String sourceType) {
            this.sourceType = Objects.requireNonNull(sourceType);
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetArtifactSourceResult build() {
            return new GetArtifactSourceResult(artifactRoot, authentication, id, location, name, sourceType, tags, type);
        }
    }
}
