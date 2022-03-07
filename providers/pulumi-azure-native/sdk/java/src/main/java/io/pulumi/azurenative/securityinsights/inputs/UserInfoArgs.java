// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * User information that made some action
 * 
 */
public final class UserInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final UserInfoArgs Empty = new UserInfoArgs();

    /**
     * The object id of the user.
     * 
     */
    @InputImport(name="objectId", required=true)
      private final Input<String> objectId;

    public Input<String> getObjectId() {
        return this.objectId;
    }

    public UserInfoArgs(Input<String> objectId) {
        this.objectId = Objects.requireNonNull(objectId, "expected parameter 'objectId' to be non-null");
    }

    private UserInfoArgs() {
        this.objectId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> objectId;

        public Builder() {
    	      // Empty
        }

        public Builder(UserInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.objectId = defaults.objectId;
        }

        public Builder setObjectId(Input<String> objectId) {
            this.objectId = Objects.requireNonNull(objectId);
            return this;
        }

        public Builder setObjectId(String objectId) {
            this.objectId = Input.of(Objects.requireNonNull(objectId));
            return this;
        }
        public UserInfoArgs build() {
            return new UserInfoArgs(objectId);
        }
    }
}