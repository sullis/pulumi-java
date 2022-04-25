// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sagemaker.outputs;

import com.pulumi.aws.sagemaker.outputs.WorkteamMemberDefinitionCognitoMemberDefinition;
import com.pulumi.aws.sagemaker.outputs.WorkteamMemberDefinitionOidcMemberDefinition;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WorkteamMemberDefinition {
    /**
     * @return The Amazon Cognito user group that is part of the work team. See Cognito Member Definition details below.
     * 
     */
    private final @Nullable WorkteamMemberDefinitionCognitoMemberDefinition cognitoMemberDefinition;
    /**
     * @return A list user groups that exist in your OIDC Identity Provider (IdP). One to ten groups can be used to create a single private work team. See Cognito Member Definition details below.
     * 
     */
    private final @Nullable WorkteamMemberDefinitionOidcMemberDefinition oidcMemberDefinition;

    @CustomType.Constructor
    private WorkteamMemberDefinition(
        @CustomType.Parameter("cognitoMemberDefinition") @Nullable WorkteamMemberDefinitionCognitoMemberDefinition cognitoMemberDefinition,
        @CustomType.Parameter("oidcMemberDefinition") @Nullable WorkteamMemberDefinitionOidcMemberDefinition oidcMemberDefinition) {
        this.cognitoMemberDefinition = cognitoMemberDefinition;
        this.oidcMemberDefinition = oidcMemberDefinition;
    }

    /**
     * @return The Amazon Cognito user group that is part of the work team. See Cognito Member Definition details below.
     * 
     */
    public Optional<WorkteamMemberDefinitionCognitoMemberDefinition> cognitoMemberDefinition() {
        return Optional.ofNullable(this.cognitoMemberDefinition);
    }
    /**
     * @return A list user groups that exist in your OIDC Identity Provider (IdP). One to ten groups can be used to create a single private work team. See Cognito Member Definition details below.
     * 
     */
    public Optional<WorkteamMemberDefinitionOidcMemberDefinition> oidcMemberDefinition() {
        return Optional.ofNullable(this.oidcMemberDefinition);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkteamMemberDefinition defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable WorkteamMemberDefinitionCognitoMemberDefinition cognitoMemberDefinition;
        private @Nullable WorkteamMemberDefinitionOidcMemberDefinition oidcMemberDefinition;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkteamMemberDefinition defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cognitoMemberDefinition = defaults.cognitoMemberDefinition;
    	      this.oidcMemberDefinition = defaults.oidcMemberDefinition;
        }

        public Builder cognitoMemberDefinition(@Nullable WorkteamMemberDefinitionCognitoMemberDefinition cognitoMemberDefinition) {
            this.cognitoMemberDefinition = cognitoMemberDefinition;
            return this;
        }
        public Builder oidcMemberDefinition(@Nullable WorkteamMemberDefinitionOidcMemberDefinition oidcMemberDefinition) {
            this.oidcMemberDefinition = oidcMemberDefinition;
            return this;
        }        public WorkteamMemberDefinition build() {
            return new WorkteamMemberDefinition(cognitoMemberDefinition, oidcMemberDefinition);
        }
    }
}
