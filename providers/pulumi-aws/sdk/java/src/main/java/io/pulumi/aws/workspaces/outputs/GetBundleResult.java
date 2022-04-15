// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.workspaces.outputs;

import io.pulumi.aws.workspaces.outputs.GetBundleComputeType;
import io.pulumi.aws.workspaces.outputs.GetBundleRootStorage;
import io.pulumi.aws.workspaces.outputs.GetBundleUserStorage;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetBundleResult {
    /**
     * The ID of the bundle.
     * 
     */
    private final @Nullable String bundleId;
    /**
     * The compute type. See supported fields below.
     * 
     */
    private final List<GetBundleComputeType> computeTypes;
    /**
     * The description of the bundle.
     * 
     */
    private final String description;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * The name of the compute type.
     * 
     */
    private final @Nullable String name;
    /**
     * The owner of the bundle.
     * 
     */
    private final @Nullable String owner;
    /**
     * The root volume. See supported fields below.
     * 
     */
    private final List<GetBundleRootStorage> rootStorages;
    /**
     * The user storage. See supported fields below.
     * 
     */
    private final List<GetBundleUserStorage> userStorages;

    @CustomType.Constructor
    private GetBundleResult(
        @CustomType.Parameter("bundleId") @Nullable String bundleId,
        @CustomType.Parameter("computeTypes") List<GetBundleComputeType> computeTypes,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("owner") @Nullable String owner,
        @CustomType.Parameter("rootStorages") List<GetBundleRootStorage> rootStorages,
        @CustomType.Parameter("userStorages") List<GetBundleUserStorage> userStorages) {
        this.bundleId = bundleId;
        this.computeTypes = computeTypes;
        this.description = description;
        this.id = id;
        this.name = name;
        this.owner = owner;
        this.rootStorages = rootStorages;
        this.userStorages = userStorages;
    }

    /**
     * The ID of the bundle.
     * 
    */
    public Optional<String> bundleId() {
        return Optional.ofNullable(this.bundleId);
    }
    /**
     * The compute type. See supported fields below.
     * 
    */
    public List<GetBundleComputeType> computeTypes() {
        return this.computeTypes;
    }
    /**
     * The description of the bundle.
     * 
    */
    public String description() {
        return this.description;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String id() {
        return this.id;
    }
    /**
     * The name of the compute type.
     * 
    */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * The owner of the bundle.
     * 
    */
    public Optional<String> owner() {
        return Optional.ofNullable(this.owner);
    }
    /**
     * The root volume. See supported fields below.
     * 
    */
    public List<GetBundleRootStorage> rootStorages() {
        return this.rootStorages;
    }
    /**
     * The user storage. See supported fields below.
     * 
    */
    public List<GetBundleUserStorage> userStorages() {
        return this.userStorages;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBundleResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String bundleId;
        private List<GetBundleComputeType> computeTypes;
        private String description;
        private String id;
        private @Nullable String name;
        private @Nullable String owner;
        private List<GetBundleRootStorage> rootStorages;
        private List<GetBundleUserStorage> userStorages;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBundleResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bundleId = defaults.bundleId;
    	      this.computeTypes = defaults.computeTypes;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.owner = defaults.owner;
    	      this.rootStorages = defaults.rootStorages;
    	      this.userStorages = defaults.userStorages;
        }

        public Builder bundleId(@Nullable String bundleId) {
            this.bundleId = bundleId;
            return this;
        }
        public Builder computeTypes(List<GetBundleComputeType> computeTypes) {
            this.computeTypes = Objects.requireNonNull(computeTypes);
            return this;
        }
        public Builder computeTypes(GetBundleComputeType... computeTypes) {
            return computeTypes(List.of(computeTypes));
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder owner(@Nullable String owner) {
            this.owner = owner;
            return this;
        }
        public Builder rootStorages(List<GetBundleRootStorage> rootStorages) {
            this.rootStorages = Objects.requireNonNull(rootStorages);
            return this;
        }
        public Builder rootStorages(GetBundleRootStorage... rootStorages) {
            return rootStorages(List.of(rootStorages));
        }
        public Builder userStorages(List<GetBundleUserStorage> userStorages) {
            this.userStorages = Objects.requireNonNull(userStorages);
            return this;
        }
        public Builder userStorages(GetBundleUserStorage... userStorages) {
            return userStorages(List.of(userStorages));
        }        public GetBundleResult build() {
            return new GetBundleResult(bundleId, computeTypes, description, id, name, owner, rootStorages, userStorages);
        }
    }
}
