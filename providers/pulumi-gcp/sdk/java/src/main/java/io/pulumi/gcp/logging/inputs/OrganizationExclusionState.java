// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.logging.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class OrganizationExclusionState extends io.pulumi.resources.ResourceArgs {

    public static final OrganizationExclusionState Empty = new OrganizationExclusionState();

    /**
     * A human-readable description.
     * 
     */
    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Whether this exclusion rule should be disabled or not. This defaults to
     * false.
     * 
     */
    @InputImport(name="disabled")
    private final @Nullable Input<Boolean> disabled;

    public Input<Boolean> getDisabled() {
        return this.disabled == null ? Input.empty() : this.disabled;
    }

    /**
     * The filter to apply when excluding logs. Only log entries that match the filter are excluded.
     * See [Advanced Log Filters](https://cloud.google.com/logging/docs/view/advanced-filters) for information on how to
     * write a filter.
     * 
     */
    @InputImport(name="filter")
    private final @Nullable Input<String> filter;

    public Input<String> getFilter() {
        return this.filter == null ? Input.empty() : this.filter;
    }

    /**
     * The name of the logging exclusion.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The organization to create the exclusion in.
     * 
     */
    @InputImport(name="orgId")
    private final @Nullable Input<String> orgId;

    public Input<String> getOrgId() {
        return this.orgId == null ? Input.empty() : this.orgId;
    }

    public OrganizationExclusionState(
        @Nullable Input<String> description,
        @Nullable Input<Boolean> disabled,
        @Nullable Input<String> filter,
        @Nullable Input<String> name,
        @Nullable Input<String> orgId) {
        this.description = description;
        this.disabled = disabled;
        this.filter = filter;
        this.name = name;
        this.orgId = orgId;
    }

    private OrganizationExclusionState() {
        this.description = Input.empty();
        this.disabled = Input.empty();
        this.filter = Input.empty();
        this.name = Input.empty();
        this.orgId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OrganizationExclusionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private @Nullable Input<Boolean> disabled;
        private @Nullable Input<String> filter;
        private @Nullable Input<String> name;
        private @Nullable Input<String> orgId;

        public Builder() {
    	      // Empty
        }

        public Builder(OrganizationExclusionState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.disabled = defaults.disabled;
    	      this.filter = defaults.filter;
    	      this.name = defaults.name;
    	      this.orgId = defaults.orgId;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setDisabled(@Nullable Input<Boolean> disabled) {
            this.disabled = disabled;
            return this;
        }

        public Builder setDisabled(@Nullable Boolean disabled) {
            this.disabled = Input.ofNullable(disabled);
            return this;
        }

        public Builder setFilter(@Nullable Input<String> filter) {
            this.filter = filter;
            return this;
        }

        public Builder setFilter(@Nullable String filter) {
            this.filter = Input.ofNullable(filter);
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

        public Builder setOrgId(@Nullable Input<String> orgId) {
            this.orgId = orgId;
            return this;
        }

        public Builder setOrgId(@Nullable String orgId) {
            this.orgId = Input.ofNullable(orgId);
            return this;
        }

        public OrganizationExclusionState build() {
            return new OrganizationExclusionState(description, disabled, filter, name, orgId);
        }
    }
}
