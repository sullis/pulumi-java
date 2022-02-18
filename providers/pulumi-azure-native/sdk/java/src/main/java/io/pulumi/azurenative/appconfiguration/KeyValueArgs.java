// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appconfiguration;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class KeyValueArgs extends io.pulumi.resources.ResourceArgs {

    public static final KeyValueArgs Empty = new KeyValueArgs();

    /**
     * The name of the configuration store.
     * 
     */
    @InputImport(name="configStoreName", required=true)
    private final Input<String> configStoreName;

    public Input<String> getConfigStoreName() {
        return this.configStoreName;
    }

    /**
     * The content type of the key-value's value.
     * Providing a proper content-type can enable transformations of values when they are retrieved by applications.
     * 
     */
    @InputImport(name="contentType")
    private final @Nullable Input<String> contentType;

    public Input<String> getContentType() {
        return this.contentType == null ? Input.empty() : this.contentType;
    }

    /**
     * Identifier of key and label combination. Key and label are joined by $ character. Label is optional.
     * 
     */
    @InputImport(name="keyValueName")
    private final @Nullable Input<String> keyValueName;

    public Input<String> getKeyValueName() {
        return this.keyValueName == null ? Input.empty() : this.keyValueName;
    }

    /**
     * The name of the resource group to which the container registry belongs.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * A dictionary of tags that can help identify what a key-value may be applicable for.
     * 
     */
    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    /**
     * The value of the key-value.
     * 
     */
    @InputImport(name="value")
    private final @Nullable Input<String> value;

    public Input<String> getValue() {
        return this.value == null ? Input.empty() : this.value;
    }

    public KeyValueArgs(
        Input<String> configStoreName,
        @Nullable Input<String> contentType,
        @Nullable Input<String> keyValueName,
        Input<String> resourceGroupName,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<String> value) {
        this.configStoreName = Objects.requireNonNull(configStoreName, "expected parameter 'configStoreName' to be non-null");
        this.contentType = contentType;
        this.keyValueName = keyValueName;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
        this.value = value;
    }

    private KeyValueArgs() {
        this.configStoreName = Input.empty();
        this.contentType = Input.empty();
        this.keyValueName = Input.empty();
        this.resourceGroupName = Input.empty();
        this.tags = Input.empty();
        this.value = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyValueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> configStoreName;
        private @Nullable Input<String> contentType;
        private @Nullable Input<String> keyValueName;
        private Input<String> resourceGroupName;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyValueArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configStoreName = defaults.configStoreName;
    	      this.contentType = defaults.contentType;
    	      this.keyValueName = defaults.keyValueName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
    	      this.value = defaults.value;
        }

        public Builder setConfigStoreName(Input<String> configStoreName) {
            this.configStoreName = Objects.requireNonNull(configStoreName);
            return this;
        }

        public Builder setConfigStoreName(String configStoreName) {
            this.configStoreName = Input.of(Objects.requireNonNull(configStoreName));
            return this;
        }

        public Builder setContentType(@Nullable Input<String> contentType) {
            this.contentType = contentType;
            return this;
        }

        public Builder setContentType(@Nullable String contentType) {
            this.contentType = Input.ofNullable(contentType);
            return this;
        }

        public Builder setKeyValueName(@Nullable Input<String> keyValueName) {
            this.keyValueName = keyValueName;
            return this;
        }

        public Builder setKeyValueName(@Nullable String keyValueName) {
            this.keyValueName = Input.ofNullable(keyValueName);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
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

        public KeyValueArgs build() {
            return new KeyValueArgs(configStoreName, contentType, keyValueName, resourceGroupName, tags, value);
        }
    }
}
