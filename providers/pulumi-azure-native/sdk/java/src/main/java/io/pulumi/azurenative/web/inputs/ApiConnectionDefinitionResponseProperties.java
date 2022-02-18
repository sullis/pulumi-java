// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.azurenative.web.inputs.ApiConnectionTestLinkResponse;
import io.pulumi.azurenative.web.inputs.ApiReferenceResponse;
import io.pulumi.azurenative.web.inputs.ConnectionStatusDefinitionResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApiConnectionDefinitionResponseProperties extends io.pulumi.resources.InvokeArgs {

    public static final ApiConnectionDefinitionResponseProperties Empty = new ApiConnectionDefinitionResponseProperties();

    @InputImport(name="api")
    private final @Nullable ApiReferenceResponse api;

    public Optional<ApiReferenceResponse> getApi() {
        return this.api == null ? Optional.empty() : Optional.ofNullable(this.api);
    }

    /**
     * Timestamp of last connection change
     * 
     */
    @InputImport(name="changedTime")
    private final @Nullable String changedTime;

    public Optional<String> getChangedTime() {
        return this.changedTime == null ? Optional.empty() : Optional.ofNullable(this.changedTime);
    }

    /**
     * Timestamp of the connection creation
     * 
     */
    @InputImport(name="createdTime")
    private final @Nullable String createdTime;

    public Optional<String> getCreatedTime() {
        return this.createdTime == null ? Optional.empty() : Optional.ofNullable(this.createdTime);
    }

    /**
     * Dictionary of custom parameter values
     * 
     */
    @InputImport(name="customParameterValues")
    private final @Nullable Map<String,String> customParameterValues;

    public Map<String,String> getCustomParameterValues() {
        return this.customParameterValues == null ? Map.of() : this.customParameterValues;
    }

    /**
     * Display name
     * 
     */
    @InputImport(name="displayName")
    private final @Nullable String displayName;

    public Optional<String> getDisplayName() {
        return this.displayName == null ? Optional.empty() : Optional.ofNullable(this.displayName);
    }

    /**
     * Dictionary of nonsecret parameter values
     * 
     */
    @InputImport(name="nonSecretParameterValues")
    private final @Nullable Map<String,String> nonSecretParameterValues;

    public Map<String,String> getNonSecretParameterValues() {
        return this.nonSecretParameterValues == null ? Map.of() : this.nonSecretParameterValues;
    }

    /**
     * Dictionary of parameter values
     * 
     */
    @InputImport(name="parameterValues")
    private final @Nullable Map<String,String> parameterValues;

    public Map<String,String> getParameterValues() {
        return this.parameterValues == null ? Map.of() : this.parameterValues;
    }

    /**
     * Status of the connection
     * 
     */
    @InputImport(name="statuses")
    private final @Nullable List<ConnectionStatusDefinitionResponse> statuses;

    public List<ConnectionStatusDefinitionResponse> getStatuses() {
        return this.statuses == null ? List.of() : this.statuses;
    }

    /**
     * Links to test the API connection
     * 
     */
    @InputImport(name="testLinks")
    private final @Nullable List<ApiConnectionTestLinkResponse> testLinks;

    public List<ApiConnectionTestLinkResponse> getTestLinks() {
        return this.testLinks == null ? List.of() : this.testLinks;
    }

    public ApiConnectionDefinitionResponseProperties(
        @Nullable ApiReferenceResponse api,
        @Nullable String changedTime,
        @Nullable String createdTime,
        @Nullable Map<String,String> customParameterValues,
        @Nullable String displayName,
        @Nullable Map<String,String> nonSecretParameterValues,
        @Nullable Map<String,String> parameterValues,
        @Nullable List<ConnectionStatusDefinitionResponse> statuses,
        @Nullable List<ApiConnectionTestLinkResponse> testLinks) {
        this.api = api;
        this.changedTime = changedTime;
        this.createdTime = createdTime;
        this.customParameterValues = customParameterValues;
        this.displayName = displayName;
        this.nonSecretParameterValues = nonSecretParameterValues;
        this.parameterValues = parameterValues;
        this.statuses = statuses;
        this.testLinks = testLinks;
    }

    private ApiConnectionDefinitionResponseProperties() {
        this.api = null;
        this.changedTime = null;
        this.createdTime = null;
        this.customParameterValues = Map.of();
        this.displayName = null;
        this.nonSecretParameterValues = Map.of();
        this.parameterValues = Map.of();
        this.statuses = List.of();
        this.testLinks = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiConnectionDefinitionResponseProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ApiReferenceResponse api;
        private @Nullable String changedTime;
        private @Nullable String createdTime;
        private @Nullable Map<String,String> customParameterValues;
        private @Nullable String displayName;
        private @Nullable Map<String,String> nonSecretParameterValues;
        private @Nullable Map<String,String> parameterValues;
        private @Nullable List<ConnectionStatusDefinitionResponse> statuses;
        private @Nullable List<ApiConnectionTestLinkResponse> testLinks;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiConnectionDefinitionResponseProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.api = defaults.api;
    	      this.changedTime = defaults.changedTime;
    	      this.createdTime = defaults.createdTime;
    	      this.customParameterValues = defaults.customParameterValues;
    	      this.displayName = defaults.displayName;
    	      this.nonSecretParameterValues = defaults.nonSecretParameterValues;
    	      this.parameterValues = defaults.parameterValues;
    	      this.statuses = defaults.statuses;
    	      this.testLinks = defaults.testLinks;
        }

        public Builder setApi(@Nullable ApiReferenceResponse api) {
            this.api = api;
            return this;
        }

        public Builder setChangedTime(@Nullable String changedTime) {
            this.changedTime = changedTime;
            return this;
        }

        public Builder setCreatedTime(@Nullable String createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        public Builder setCustomParameterValues(@Nullable Map<String,String> customParameterValues) {
            this.customParameterValues = customParameterValues;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setNonSecretParameterValues(@Nullable Map<String,String> nonSecretParameterValues) {
            this.nonSecretParameterValues = nonSecretParameterValues;
            return this;
        }

        public Builder setParameterValues(@Nullable Map<String,String> parameterValues) {
            this.parameterValues = parameterValues;
            return this;
        }

        public Builder setStatuses(@Nullable List<ConnectionStatusDefinitionResponse> statuses) {
            this.statuses = statuses;
            return this;
        }

        public Builder setTestLinks(@Nullable List<ApiConnectionTestLinkResponse> testLinks) {
            this.testLinks = testLinks;
            return this;
        }

        public ApiConnectionDefinitionResponseProperties build() {
            return new ApiConnectionDefinitionResponseProperties(api, changedTime, createdTime, customParameterValues, displayName, nonSecretParameterValues, parameterValues, statuses, testLinks);
        }
    }
}
