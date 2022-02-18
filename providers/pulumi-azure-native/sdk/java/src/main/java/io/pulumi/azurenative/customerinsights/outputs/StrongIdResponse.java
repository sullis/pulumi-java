// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customerinsights.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class StrongIdResponse {
    /**
     * Localized descriptions.
     * 
     */
    private final @Nullable Map<String,String> description;
    /**
     * Localized display name.
     * 
     */
    private final @Nullable Map<String,String> displayName;
    /**
     * The properties which make up the unique ID.
     * 
     */
    private final List<String> keyPropertyNames;
    /**
     * The Name identifying the strong ID.
     * 
     */
    private final String strongIdName;

    @OutputCustomType.Constructor({"description","displayName","keyPropertyNames","strongIdName"})
    private StrongIdResponse(
        @Nullable Map<String,String> description,
        @Nullable Map<String,String> displayName,
        List<String> keyPropertyNames,
        String strongIdName) {
        this.description = description;
        this.displayName = displayName;
        this.keyPropertyNames = Objects.requireNonNull(keyPropertyNames);
        this.strongIdName = Objects.requireNonNull(strongIdName);
    }

    /**
     * Localized descriptions.
     * 
     */
    public Map<String,String> getDescription() {
        return this.description == null ? Map.of() : this.description;
    }
    /**
     * Localized display name.
     * 
     */
    public Map<String,String> getDisplayName() {
        return this.displayName == null ? Map.of() : this.displayName;
    }
    /**
     * The properties which make up the unique ID.
     * 
     */
    public List<String> getKeyPropertyNames() {
        return this.keyPropertyNames;
    }
    /**
     * The Name identifying the strong ID.
     * 
     */
    public String getStrongIdName() {
        return this.strongIdName;
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
