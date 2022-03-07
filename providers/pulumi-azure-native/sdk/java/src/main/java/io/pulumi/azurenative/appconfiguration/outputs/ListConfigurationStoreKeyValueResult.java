// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.appconfiguration.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@OutputCustomType
public final class ListConfigurationStoreKeyValueResult {
    /**
     * The content type of the key-value's value.
     * Providing a proper content-type can enable transformations of values when they are retrieved by applications.
     * 
     */
    private final String contentType;
    /**
     * An ETag indicating the state of a key-value within a configuration store.
     * 
     */
    private final String eTag;
    /**
     * The primary identifier of a key-value.
     * The key is used in unison with the label to uniquely identify a key-value.
     * 
     */
    private final String key;
    /**
     * A value used to group key-values.
     * The label is used in unison with the key to uniquely identify a key-value.
     * 
     */
    private final String label;
    /**
     * The last time a modifying operation was performed on the given key-value.
     * 
     */
    private final String lastModified;
    /**
     * A value indicating whether the key-value is locked.
     * A locked key-value may not be modified until it is unlocked.
     * 
     */
    private final Boolean locked;
    /**
     * A dictionary of tags that can help identify what a key-value may be applicable for.
     * 
     */
    private final Map<String,String> tags;
    /**
     * The value of the key-value.
     * 
     */
    private final String value;

    @OutputCustomType.Constructor({"contentType","eTag","key","label","lastModified","locked","tags","value"})
    private ListConfigurationStoreKeyValueResult(
        String contentType,
        String eTag,
        String key,
        String label,
        String lastModified,
        Boolean locked,
        Map<String,String> tags,
        String value) {
        this.contentType = Objects.requireNonNull(contentType);
        this.eTag = Objects.requireNonNull(eTag);
        this.key = Objects.requireNonNull(key);
        this.label = Objects.requireNonNull(label);
        this.lastModified = Objects.requireNonNull(lastModified);
        this.locked = Objects.requireNonNull(locked);
        this.tags = Objects.requireNonNull(tags);
        this.value = Objects.requireNonNull(value);
    }

    /**
     * The content type of the key-value's value.
     * Providing a proper content-type can enable transformations of values when they are retrieved by applications.
     * 
    */
    public String getContentType() {
        return this.contentType;
    }
    /**
     * An ETag indicating the state of a key-value within a configuration store.
     * 
    */
    public String getETag() {
        return this.eTag;
    }
    /**
     * The primary identifier of a key-value.
     * The key is used in unison with the label to uniquely identify a key-value.
     * 
    */
    public String getKey() {
        return this.key;
    }
    /**
     * A value used to group key-values.
     * The label is used in unison with the key to uniquely identify a key-value.
     * 
    */
    public String getLabel() {
        return this.label;
    }
    /**
     * The last time a modifying operation was performed on the given key-value.
     * 
    */
    public String getLastModified() {
        return this.lastModified;
    }
    /**
     * A value indicating whether the key-value is locked.
     * A locked key-value may not be modified until it is unlocked.
     * 
    */
    public Boolean getLocked() {
        return this.locked;
    }
    /**
     * A dictionary of tags that can help identify what a key-value may be applicable for.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags;
    }
    /**
     * The value of the key-value.
     * 
    */
    public String getValue() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListConfigurationStoreKeyValueResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String contentType;
        private String eTag;
        private String key;
        private String label;
        private String lastModified;
        private Boolean locked;
        private Map<String,String> tags;
        private String value;

        public Builder() {
    	      // Empty
        }

        public Builder(ListConfigurationStoreKeyValueResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contentType = defaults.contentType;
    	      this.eTag = defaults.eTag;
    	      this.key = defaults.key;
    	      this.label = defaults.label;
    	      this.lastModified = defaults.lastModified;
    	      this.locked = defaults.locked;
    	      this.tags = defaults.tags;
    	      this.value = defaults.value;
        }

        public Builder setContentType(String contentType) {
            this.contentType = Objects.requireNonNull(contentType);
            return this;
        }

        public Builder setETag(String eTag) {
            this.eTag = Objects.requireNonNull(eTag);
            return this;
        }

        public Builder setKey(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder setLabel(String label) {
            this.label = Objects.requireNonNull(label);
            return this;
        }

        public Builder setLastModified(String lastModified) {
            this.lastModified = Objects.requireNonNull(lastModified);
            return this;
        }

        public Builder setLocked(Boolean locked) {
            this.locked = Objects.requireNonNull(locked);
            return this;
        }

        public Builder setTags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }

        public Builder setValue(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public ListConfigurationStoreKeyValueResult build() {
            return new ListConfigurationStoreKeyValueResult(contentType, eTag, key, label, lastModified, locked, tags, value);
        }
    }
}