// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.emr;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class StudioSessionMappingArgs extends io.pulumi.resources.ResourceArgs {

    public static final StudioSessionMappingArgs Empty = new StudioSessionMappingArgs();

    /**
     * The globally unique identifier (GUID) of the user or group from the Amazon Web Services SSO Identity Store.
     * 
     */
    @InputImport(name="identityId")
      private final @Nullable Input<String> identityId;

    public Input<String> getIdentityId() {
        return this.identityId == null ? Input.empty() : this.identityId;
    }

    /**
     * The name of the user or group from the Amazon Web Services SSO Identity Store.
     * 
     */
    @InputImport(name="identityName")
      private final @Nullable Input<String> identityName;

    public Input<String> getIdentityName() {
        return this.identityName == null ? Input.empty() : this.identityName;
    }

    /**
     * Specifies whether the identity to map to the Amazon EMR Studio is a `USER` or a `GROUP`.
     * 
     */
    @InputImport(name="identityType", required=true)
      private final Input<String> identityType;

    public Input<String> getIdentityType() {
        return this.identityType;
    }

    /**
     * The Amazon Resource Name (ARN) for the session policy that will be applied to the user or group. You should specify the ARN for the session policy that you want to apply, not the ARN of your user role.
     * 
     */
    @InputImport(name="sessionPolicyArn", required=true)
      private final Input<String> sessionPolicyArn;

    public Input<String> getSessionPolicyArn() {
        return this.sessionPolicyArn;
    }

    /**
     * The ID of the Amazon EMR Studio to which the user or group will be mapped.
     * 
     */
    @InputImport(name="studioId", required=true)
      private final Input<String> studioId;

    public Input<String> getStudioId() {
        return this.studioId;
    }

    public StudioSessionMappingArgs(
        @Nullable Input<String> identityId,
        @Nullable Input<String> identityName,
        Input<String> identityType,
        Input<String> sessionPolicyArn,
        Input<String> studioId) {
        this.identityId = identityId;
        this.identityName = identityName;
        this.identityType = Objects.requireNonNull(identityType, "expected parameter 'identityType' to be non-null");
        this.sessionPolicyArn = Objects.requireNonNull(sessionPolicyArn, "expected parameter 'sessionPolicyArn' to be non-null");
        this.studioId = Objects.requireNonNull(studioId, "expected parameter 'studioId' to be non-null");
    }

    private StudioSessionMappingArgs() {
        this.identityId = Input.empty();
        this.identityName = Input.empty();
        this.identityType = Input.empty();
        this.sessionPolicyArn = Input.empty();
        this.studioId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StudioSessionMappingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> identityId;
        private @Nullable Input<String> identityName;
        private Input<String> identityType;
        private Input<String> sessionPolicyArn;
        private Input<String> studioId;

        public Builder() {
    	      // Empty
        }

        public Builder(StudioSessionMappingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identityId = defaults.identityId;
    	      this.identityName = defaults.identityName;
    	      this.identityType = defaults.identityType;
    	      this.sessionPolicyArn = defaults.sessionPolicyArn;
    	      this.studioId = defaults.studioId;
        }

        public Builder setIdentityId(@Nullable Input<String> identityId) {
            this.identityId = identityId;
            return this;
        }

        public Builder setIdentityId(@Nullable String identityId) {
            this.identityId = Input.ofNullable(identityId);
            return this;
        }

        public Builder setIdentityName(@Nullable Input<String> identityName) {
            this.identityName = identityName;
            return this;
        }

        public Builder setIdentityName(@Nullable String identityName) {
            this.identityName = Input.ofNullable(identityName);
            return this;
        }

        public Builder setIdentityType(Input<String> identityType) {
            this.identityType = Objects.requireNonNull(identityType);
            return this;
        }

        public Builder setIdentityType(String identityType) {
            this.identityType = Input.of(Objects.requireNonNull(identityType));
            return this;
        }

        public Builder setSessionPolicyArn(Input<String> sessionPolicyArn) {
            this.sessionPolicyArn = Objects.requireNonNull(sessionPolicyArn);
            return this;
        }

        public Builder setSessionPolicyArn(String sessionPolicyArn) {
            this.sessionPolicyArn = Input.of(Objects.requireNonNull(sessionPolicyArn));
            return this;
        }

        public Builder setStudioId(Input<String> studioId) {
            this.studioId = Objects.requireNonNull(studioId);
            return this;
        }

        public Builder setStudioId(String studioId) {
            this.studioId = Input.of(Objects.requireNonNull(studioId));
            return this;
        }
        public StudioSessionMappingArgs build() {
            return new StudioSessionMappingArgs(identityId, identityName, identityType, sessionPolicyArn, studioId);
        }
    }
}