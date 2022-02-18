// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * GroupMembers Item.
 * 
 */
public final class GroupMembersItemResponse extends io.pulumi.resources.InvokeArgs {

    public static final GroupMembersItemResponse Empty = new GroupMembersItemResponse();

    /**
     * Resource Id.
     * 
     */
    @InputImport(name="resourceId")
    private final @Nullable String resourceId;

    public Optional<String> getResourceId() {
        return this.resourceId == null ? Optional.empty() : Optional.ofNullable(this.resourceId);
    }

    public GroupMembersItemResponse(@Nullable String resourceId) {
        this.resourceId = resourceId;
    }

    private GroupMembersItemResponse() {
        this.resourceId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GroupMembersItemResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String resourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(GroupMembersItemResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceId = defaults.resourceId;
        }

        public Builder setResourceId(@Nullable String resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        public GroupMembersItemResponse build() {
            return new GroupMembersItemResponse(resourceId);
        }
    }
}
