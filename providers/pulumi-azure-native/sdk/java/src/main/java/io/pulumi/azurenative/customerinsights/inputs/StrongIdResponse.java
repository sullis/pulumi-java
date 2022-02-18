// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customerinsights.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Property/Properties which represent a unique ID.
 * 
 */
public final class StrongIdResponse extends io.pulumi.resources.InvokeArgs {

    public static final StrongIdResponse Empty = new StrongIdResponse();

    /**
     * Localized descriptions.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Map<String,String> description;

    public Map<String,String> getDescription() {
        return this.description == null ? Map.of() : this.description;
    }

    /**
     * Localized display name.
     * 
     */
    @InputImport(name="displayName")
    private final @Nullable Map<String,String> displayName;

    public Map<String,String> getDisplayName() {
        return this.displayName == null ? Map.of() : this.displayName;
    }

    /**
     * The properties which make up the unique ID.
     * 
     */
    @InputImport(name="keyPropertyNames", required=true)
    private final List<String> keyPropertyNames;

    public List<String> getKeyPropertyNames() {
        return this.keyPropertyNames;
    }

    /**
     * The Name identifying the strong ID.
     * 
     */
    @InputImport(name="strongIdName", required=true)
    private final String strongIdName;

    public String getStrongIdName() {
        return this.strongIdName;
    }

    public StrongIdResponse(
        @Nullable Map<String,String> description,
        @Nullable Map<String,String> displayName,
        List<String> keyPropertyNames,
        String strongIdName) {
        this.description = description;
        this.displayName = displayName;
        this.keyPropertyNames = Objects.requireNonNull(keyPropertyNames, "expected parameter 'keyPropertyNames' to be non-null");
        this.strongIdName = Objects.requireNonNull(strongIdName, "expected parameter 'strongIdName' to be non-null");
    }

    private StrongIdResponse() {
        this.description = Map.of();
        this.displayName = Map.of();
        this.keyPropertyNames = List.of();
        this.strongIdName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StrongIdResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Map<String,String> description;
        private @Nullable Map<String,String> displayName;
        private List<String> keyPropertyNames;
        private String strongIdName;

        public Builder() {
    	      // Empty
        }

        public Builder(StrongIdResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.keyPropertyNames = defaults.keyPropertyNames;
    	      this.strongIdName = defaults.strongIdName;
        }

        public Builder setDescription(@Nullable Map<String,String> description) {
            this.description = description;
            return this;
        }

        public Builder setDisplayName(@Nullable Map<String,String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setKeyPropertyNames(List<String> keyPropertyNames) {
            this.keyPropertyNames = Objects.requireNonNull(keyPropertyNames);
            return this;
        }

        public Builder setStrongIdName(String strongIdName) {
            this.strongIdName = Objects.requireNonNull(strongIdName);
            return this;
        }

        public StrongIdResponse build() {
            return new StrongIdResponse(description, displayName, keyPropertyNames, strongIdName);
        }
    }
}
