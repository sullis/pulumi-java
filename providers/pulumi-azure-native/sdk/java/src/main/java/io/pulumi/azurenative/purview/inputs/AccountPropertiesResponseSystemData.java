// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.purview.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Metadata pertaining to creation and last modification of the resource.
 * 
 */
public final class AccountPropertiesResponseSystemData extends io.pulumi.resources.InvokeArgs {

    public static final AccountPropertiesResponseSystemData Empty = new AccountPropertiesResponseSystemData();

    /**
     * The timestamp of resource creation (UTC).
     * 
     */
    @InputImport(name="createdAt", required=true)
    private final String createdAt;

    public String getCreatedAt() {
        return this.createdAt;
    }

    /**
     * The identity that created the resource.
     * 
     */
    @InputImport(name="createdBy", required=true)
    private final String createdBy;

    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * The type of identity that created the resource.
     * 
     */
    @InputImport(name="createdByType", required=true)
    private final String createdByType;

    public String getCreatedByType() {
        return this.createdByType;
    }

    /**
     * The timestamp of the last modification the resource (UTC).
     * 
     */
    @InputImport(name="lastModifiedAt", required=true)
    private final String lastModifiedAt;

    public String getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
     * The identity that last modified the resource.
     * 
     */
    @InputImport(name="lastModifiedBy", required=true)
    private final String lastModifiedBy;

    public String getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     * The type of identity that last modified the resource.
     * 
     */
    @InputImport(name="lastModifiedByType", required=true)
    private final String lastModifiedByType;

    public String getLastModifiedByType() {
        return this.lastModifiedByType;
    }

    public AccountPropertiesResponseSystemData(
        String createdAt,
        String createdBy,
        String createdByType,
        String lastModifiedAt,
        String lastModifiedBy,
        String lastModifiedByType) {
        this.createdAt = Objects.requireNonNull(createdAt, "expected parameter 'createdAt' to be non-null");
        this.createdBy = Objects.requireNonNull(createdBy, "expected parameter 'createdBy' to be non-null");
        this.createdByType = Objects.requireNonNull(createdByType, "expected parameter 'createdByType' to be non-null");
        this.lastModifiedAt = Objects.requireNonNull(lastModifiedAt, "expected parameter 'lastModifiedAt' to be non-null");
        this.lastModifiedBy = Objects.requireNonNull(lastModifiedBy, "expected parameter 'lastModifiedBy' to be non-null");
        this.lastModifiedByType = Objects.requireNonNull(lastModifiedByType, "expected parameter 'lastModifiedByType' to be non-null");
    }

    private AccountPropertiesResponseSystemData() {
        this.createdAt = null;
        this.createdBy = null;
        this.createdByType = null;
        this.lastModifiedAt = null;
        this.lastModifiedBy = null;
        this.lastModifiedByType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccountPropertiesResponseSystemData defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createdAt;
        private String createdBy;
        private String createdByType;
        private String lastModifiedAt;
        private String lastModifiedBy;
        private String lastModifiedByType;

        public Builder() {
    	      // Empty
        }

        public Builder(AccountPropertiesResponseSystemData defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createdAt = defaults.createdAt;
    	      this.createdBy = defaults.createdBy;
    	      this.createdByType = defaults.createdByType;
    	      this.lastModifiedAt = defaults.lastModifiedAt;
    	      this.lastModifiedBy = defaults.lastModifiedBy;
    	      this.lastModifiedByType = defaults.lastModifiedByType;
        }

        public Builder setCreatedAt(String createdAt) {
            this.createdAt = Objects.requireNonNull(createdAt);
            return this;
        }

        public Builder setCreatedBy(String createdBy) {
            this.createdBy = Objects.requireNonNull(createdBy);
            return this;
        }

        public Builder setCreatedByType(String createdByType) {
            this.createdByType = Objects.requireNonNull(createdByType);
            return this;
        }

        public Builder setLastModifiedAt(String lastModifiedAt) {
            this.lastModifiedAt = Objects.requireNonNull(lastModifiedAt);
            return this;
        }

        public Builder setLastModifiedBy(String lastModifiedBy) {
            this.lastModifiedBy = Objects.requireNonNull(lastModifiedBy);
            return this;
        }

        public Builder setLastModifiedByType(String lastModifiedByType) {
            this.lastModifiedByType = Objects.requireNonNull(lastModifiedByType);
            return this;
        }

        public AccountPropertiesResponseSystemData build() {
            return new AccountPropertiesResponseSystemData(createdAt, createdBy, createdByType, lastModifiedAt, lastModifiedBy, lastModifiedByType);
        }
    }
}
