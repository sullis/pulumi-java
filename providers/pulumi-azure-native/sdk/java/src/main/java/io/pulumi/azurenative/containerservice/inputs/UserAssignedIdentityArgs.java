// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class UserAssignedIdentityArgs extends io.pulumi.resources.ResourceArgs {

    public static final UserAssignedIdentityArgs Empty = new UserAssignedIdentityArgs();

    /**
     * The client id of the user assigned identity.
     * 
     */
    @InputImport(name="clientId")
    private final @Nullable Input<String> clientId;

    public Input<String> getClientId() {
        return this.clientId == null ? Input.empty() : this.clientId;
    }

    /**
     * The object id of the user assigned identity.
     * 
     */
    @InputImport(name="objectId")
    private final @Nullable Input<String> objectId;

    public Input<String> getObjectId() {
        return this.objectId == null ? Input.empty() : this.objectId;
    }

    /**
     * The resource id of the user assigned identity.
     * 
     */
    @InputImport(name="resourceId")
    private final @Nullable Input<String> resourceId;

    public Input<String> getResourceId() {
        return this.resourceId == null ? Input.empty() : this.resourceId;
    }

    public UserAssignedIdentityArgs(
        @Nullable Input<String> clientId,
        @Nullable Input<String> objectId,
        @Nullable Input<String> resourceId) {
        this.clientId = clientId;
        this.objectId = objectId;
        this.resourceId = resourceId;
    }

    private UserAssignedIdentityArgs() {
        this.clientId = Input.empty();
        this.objectId = Input.empty();
        this.resourceId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserAssignedIdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> clientId;
        private @Nullable Input<String> objectId;
        private @Nullable Input<String> resourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(UserAssignedIdentityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientId = defaults.clientId;
    	      this.objectId = defaults.objectId;
    	      this.resourceId = defaults.resourceId;
        }

        public Builder setClientId(@Nullable Input<String> clientId) {
            this.clientId = clientId;
            return this;
        }

        public Builder setClientId(@Nullable String clientId) {
            this.clientId = Input.ofNullable(clientId);
            return this;
        }

        public Builder setObjectId(@Nullable Input<String> objectId) {
            this.objectId = objectId;
            return this;
        }

        public Builder setObjectId(@Nullable String objectId) {
            this.objectId = Input.ofNullable(objectId);
            return this;
        }

        public Builder setResourceId(@Nullable Input<String> resourceId) {
            this.resourceId = resourceId;
            return this;
        }

        public Builder setResourceId(@Nullable String resourceId) {
            this.resourceId = Input.ofNullable(resourceId);
            return this;
        }

        public UserAssignedIdentityArgs build() {
            return new UserAssignedIdentityArgs(clientId, objectId, resourceId);
        }
    }
}
