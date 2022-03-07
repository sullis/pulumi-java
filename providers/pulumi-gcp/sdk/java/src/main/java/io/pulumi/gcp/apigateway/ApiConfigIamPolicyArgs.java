// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.apigateway;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApiConfigIamPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApiConfigIamPolicyArgs Empty = new ApiConfigIamPolicyArgs();

    /**
     * The API to attach the config to.
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @InputImport(name="api", required=true)
      private final Input<String> api;

    public Input<String> getApi() {
        return this.api;
    }

    @InputImport(name="apiConfig", required=true)
      private final Input<String> apiConfig;

    public Input<String> getApiConfig() {
        return this.apiConfig;
    }

    /**
     * The policy data generated by
     * a `gcp.organizations.getIAMPolicy` data source.
     * 
     */
    @InputImport(name="policyData", required=true)
      private final Input<String> policyData;

    public Input<String> getPolicyData() {
        return this.policyData;
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

    public ApiConfigIamPolicyArgs(
        Input<String> api,
        Input<String> apiConfig,
        Input<String> policyData,
        @Nullable Input<String> project) {
        this.api = Objects.requireNonNull(api, "expected parameter 'api' to be non-null");
        this.apiConfig = Objects.requireNonNull(apiConfig, "expected parameter 'apiConfig' to be non-null");
        this.policyData = Objects.requireNonNull(policyData, "expected parameter 'policyData' to be non-null");
        this.project = project;
    }

    private ApiConfigIamPolicyArgs() {
        this.api = Input.empty();
        this.apiConfig = Input.empty();
        this.policyData = Input.empty();
        this.project = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiConfigIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> api;
        private Input<String> apiConfig;
        private Input<String> policyData;
        private @Nullable Input<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiConfigIamPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.api = defaults.api;
    	      this.apiConfig = defaults.apiConfig;
    	      this.policyData = defaults.policyData;
    	      this.project = defaults.project;
        }

        public Builder setApi(Input<String> api) {
            this.api = Objects.requireNonNull(api);
            return this;
        }

        public Builder setApi(String api) {
            this.api = Input.of(Objects.requireNonNull(api));
            return this;
        }

        public Builder setApiConfig(Input<String> apiConfig) {
            this.apiConfig = Objects.requireNonNull(apiConfig);
            return this;
        }

        public Builder setApiConfig(String apiConfig) {
            this.apiConfig = Input.of(Objects.requireNonNull(apiConfig));
            return this;
        }

        public Builder setPolicyData(Input<String> policyData) {
            this.policyData = Objects.requireNonNull(policyData);
            return this;
        }

        public Builder setPolicyData(String policyData) {
            this.policyData = Input.of(Objects.requireNonNull(policyData));
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
        public ApiConfigIamPolicyArgs build() {
            return new ApiConfigIamPolicyArgs(api, apiConfig, policyData, project);
        }
    }
}