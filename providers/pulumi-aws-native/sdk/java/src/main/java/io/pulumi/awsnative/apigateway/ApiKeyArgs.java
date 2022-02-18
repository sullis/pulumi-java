// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.apigateway;

import io.pulumi.awsnative.apigateway.inputs.ApiKeyStageKeyArgs;
import io.pulumi.awsnative.apigateway.inputs.ApiKeyTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApiKeyArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApiKeyArgs Empty = new ApiKeyArgs();

    /**
     * An AWS Marketplace customer identifier to use when integrating with the AWS SaaS Marketplace.
     * 
     */
    @InputImport(name="customerId")
    private final @Nullable Input<String> customerId;

    public Input<String> getCustomerId() {
        return this.customerId == null ? Input.empty() : this.customerId;
    }

    /**
     * A description of the purpose of the API key.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Indicates whether the API key can be used by clients.
     * 
     */
    @InputImport(name="enabled")
    private final @Nullable Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled == null ? Input.empty() : this.enabled;
    }

    /**
     * Specifies whether the key identifier is distinct from the created API key value. This parameter is deprecated and should not be used.
     * 
     */
    @InputImport(name="generateDistinctId")
    private final @Nullable Input<Boolean> generateDistinctId;

    public Input<Boolean> getGenerateDistinctId() {
        return this.generateDistinctId == null ? Input.empty() : this.generateDistinctId;
    }

    /**
     * A name for the API key. If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that ID for the API key name.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * A list of stages to associate with this API key.
     * 
     */
    @InputImport(name="stageKeys")
    private final @Nullable Input<List<ApiKeyStageKeyArgs>> stageKeys;

    public Input<List<ApiKeyStageKeyArgs>> getStageKeys() {
        return this.stageKeys == null ? Input.empty() : this.stageKeys;
    }

    /**
     * An array of arbitrary tags (key-value pairs) to associate with the API key.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<List<ApiKeyTagArgs>> tags;

    public Input<List<ApiKeyTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * The value of the API key. Must be at least 20 characters long.
     * 
     */
    @InputImport(name="value")
    private final @Nullable Input<String> value;

    public Input<String> getValue() {
        return this.value == null ? Input.empty() : this.value;
    }

    public ApiKeyArgs(
        @Nullable Input<String> customerId,
        @Nullable Input<String> description,
        @Nullable Input<Boolean> enabled,
        @Nullable Input<Boolean> generateDistinctId,
        @Nullable Input<String> name,
        @Nullable Input<List<ApiKeyStageKeyArgs>> stageKeys,
        @Nullable Input<List<ApiKeyTagArgs>> tags,
        @Nullable Input<String> value) {
        this.customerId = customerId;
        this.description = description;
        this.enabled = enabled;
        this.generateDistinctId = generateDistinctId;
        this.name = name;
        this.stageKeys = stageKeys;
        this.tags = tags;
        this.value = value;
    }

    private ApiKeyArgs() {
        this.customerId = Input.empty();
        this.description = Input.empty();
        this.enabled = Input.empty();
        this.generateDistinctId = Input.empty();
        this.name = Input.empty();
        this.stageKeys = Input.empty();
        this.tags = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> customerId;
        private @Nullable Input<String> description;
        private @Nullable Input<Boolean> enabled;
        private @Nullable Input<Boolean> generateDistinctId;
        private @Nullable Input<String> name;
        private @Nullable Input<List<ApiKeyStageKeyArgs>> stageKeys;
        private @Nullable Input<List<ApiKeyTagArgs>> tags;
        private @Nullable Input<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiKeyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customerId = defaults.customerId;
    	      this.description = defaults.description;
    	      this.enabled = defaults.enabled;
    	      this.generateDistinctId = defaults.generateDistinctId;
    	      this.name = defaults.name;
    	      this.stageKeys = defaults.stageKeys;
    	      this.tags = defaults.tags;
    	      this.value = defaults.value;
        }

        public Builder setCustomerId(@Nullable Input<String> customerId) {
            this.customerId = customerId;
            return this;
        }

        public Builder setCustomerId(@Nullable String customerId) {
            this.customerId = Input.ofNullable(customerId);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setEnabled(@Nullable Input<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = Input.ofNullable(enabled);
            return this;
        }

        public Builder setGenerateDistinctId(@Nullable Input<Boolean> generateDistinctId) {
            this.generateDistinctId = generateDistinctId;
            return this;
        }

        public Builder setGenerateDistinctId(@Nullable Boolean generateDistinctId) {
            this.generateDistinctId = Input.ofNullable(generateDistinctId);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setStageKeys(@Nullable Input<List<ApiKeyStageKeyArgs>> stageKeys) {
            this.stageKeys = stageKeys;
            return this;
        }

        public Builder setStageKeys(@Nullable List<ApiKeyStageKeyArgs> stageKeys) {
            this.stageKeys = Input.ofNullable(stageKeys);
            return this;
        }

        public Builder setTags(@Nullable Input<List<ApiKeyTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<ApiKeyTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setValue(@Nullable Input<String> value) {
            this.value = value;
            return this;
        }

        public Builder setValue(@Nullable String value) {
            this.value = Input.ofNullable(value);
            return this;
        }

        public ApiKeyArgs build() {
            return new ApiKeyArgs(customerId, description, enabled, generateDistinctId, name, stageKeys, tags, value);
        }
    }
}
