// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.apigateway.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApiConfigIamPolicyState extends io.pulumi.resources.ResourceArgs {

    public static final ApiConfigIamPolicyState Empty = new ApiConfigIamPolicyState();

    /**
     * The API to attach the config to.
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @InputImport(name="api")
      private final @Nullable Input<String> api;

    public Input<String> getApi() {
        return this.api == null ? Input.empty() : this.api;
    }

    @InputImport(name="apiConfig")
      private final @Nullable Input<String> apiConfig;

    public Input<String> getApiConfig() {
        return this.apiConfig == null ? Input.empty() : this.apiConfig;
    }

    /**
     * (Computed) The etag of the IAM policy.
     * 
     */
    @InputImport(name="etag")
      private final @Nullable Input<String> etag;

    public Input<String> getEtag() {
        return this.etag == null ? Input.empty() : this.etag;
    }

    /**
     * The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     * 
     */
    @InputImport(name="policyData")
      private final @Nullable Input<String> policyData;

    public Input<String> getPolicyData() {
        return this.policyData == null ? Input.empty() : this.policyData;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     * 
     */
    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    public ApiConfigIamPolicyState(
        @Nullable Input<String> api,
        @Nullable Input<String> apiConfig,
        @Nullable Input<String> etag,
        @Nullable Input<String> policyData,
        @Nullable Input<String> project) {
        this.api = api;
        this.apiConfig = apiConfig;
        this.etag = etag;
        this.policyData = policyData;
        this.project = project;
    }

    private ApiConfigIamPolicyState() {
        this.api = Input.empty();
        this.apiConfig = Input.empty();
        this.etag = Input.empty();
        this.policyData = Input.empty();
        this.project = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiConfigIamPolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> api;
        private @Nullable Input<String> apiConfig;
        private @Nullable Input<String> etag;
        private @Nullable Input<String> policyData;
        private @Nullable Input<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiConfigIamPolicyState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.api = defaults.api;
    	      this.apiConfig = defaults.apiConfig;
    	      this.etag = defaults.etag;
    	      this.policyData = defaults.policyData;
    	      this.project = defaults.project;
        }

        public Builder setApi(@Nullable Input<String> api) {
            this.api = api;
            return this;
        }

        public Builder setApi(@Nullable String api) {
            this.api = Input.ofNullable(api);
            return this;
        }

        public Builder setApiConfig(@Nullable Input<String> apiConfig) {
            this.apiConfig = apiConfig;
            return this;
        }

        public Builder setApiConfig(@Nullable String apiConfig) {
            this.apiConfig = Input.ofNullable(apiConfig);
            return this;
        }

        public Builder setEtag(@Nullable Input<String> etag) {
            this.etag = etag;
            return this;
        }

        public Builder setEtag(@Nullable String etag) {
            this.etag = Input.ofNullable(etag);
            return this;
        }

        public Builder setPolicyData(@Nullable Input<String> policyData) {
            this.policyData = policyData;
            return this;
        }

        public Builder setPolicyData(@Nullable String policyData) {
            this.policyData = Input.ofNullable(policyData);
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
        public ApiConfigIamPolicyState build() {
            return new ApiConfigIamPolicyState(api, apiConfig, etag, policyData, project);
        }
    }
}