// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.emr.inputs;

import io.pulumi.awsnative.emr.enums.StudioSessionMappingIdentityType;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetStudioSessionMappingArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetStudioSessionMappingArgs Empty = new GetStudioSessionMappingArgs();

    /**
     * The name of the user or group. For more information, see UserName and DisplayName in the AWS SSO Identity Store API Reference. Either IdentityName or IdentityId must be specified.
     * 
     */
    @Import(name="identityName", required=true)
      private final String identityName;

    public String identityName() {
        return this.identityName;
    }

    /**
     * Specifies whether the identity to map to the Studio is a user or a group.
     * 
     */
    @Import(name="identityType", required=true)
      private final StudioSessionMappingIdentityType identityType;

    public StudioSessionMappingIdentityType identityType() {
        return this.identityType;
    }

    /**
     * The ID of the Amazon EMR Studio to which the user or group will be mapped.
     * 
     */
    @Import(name="studioId", required=true)
      private final String studioId;

    public String studioId() {
        return this.studioId;
    }

    public GetStudioSessionMappingArgs(
        String identityName,
        StudioSessionMappingIdentityType identityType,
        String studioId) {
        this.identityName = Objects.requireNonNull(identityName, "expected parameter 'identityName' to be non-null");
        this.identityType = Objects.requireNonNull(identityType, "expected parameter 'identityType' to be non-null");
        this.studioId = Objects.requireNonNull(studioId, "expected parameter 'studioId' to be non-null");
    }

    private GetStudioSessionMappingArgs() {
        this.identityName = null;
        this.identityType = null;
        this.studioId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetStudioSessionMappingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String identityName;
        private StudioSessionMappingIdentityType identityType;
        private String studioId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetStudioSessionMappingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.identityName = defaults.identityName;
    	      this.identityType = defaults.identityType;
    	      this.studioId = defaults.studioId;
        }

        public Builder identityName(String identityName) {
            this.identityName = Objects.requireNonNull(identityName);
            return this;
        }
        public Builder identityType(StudioSessionMappingIdentityType identityType) {
            this.identityType = Objects.requireNonNull(identityType);
            return this;
        }
        public Builder studioId(String studioId) {
            this.studioId = Objects.requireNonNull(studioId);
            return this;
        }        public GetStudioSessionMappingArgs build() {
            return new GetStudioSessionMappingArgs(identityName, identityType, studioId);
        }
    }
}
