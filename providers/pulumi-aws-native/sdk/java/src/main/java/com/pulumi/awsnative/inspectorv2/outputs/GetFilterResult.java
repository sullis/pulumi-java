// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.awsnative.inspectorv2.outputs;

import com.pulumi.awsnative.inspectorv2.enums.FilterAction;
import com.pulumi.awsnative.inspectorv2.outputs.FilterCriteria;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetFilterResult {
    /**
     * @return Findings filter ARN.
     * 
     */
    private final @Nullable String arn;
    /**
     * @return Findings filter description.
     * 
     */
    private final @Nullable String description;
    /**
     * @return Findings filter action.
     * 
     */
    private final @Nullable FilterAction filterAction;
    /**
     * @return Findings filter criteria.
     * 
     */
    private final @Nullable FilterCriteria filterCriteria;
    /**
     * @return Findings filter name.
     * 
     */
    private final @Nullable String name;

    @CustomType.Constructor
    private GetFilterResult(
        @CustomType.Parameter("arn") @Nullable String arn,
        @CustomType.Parameter("description") @Nullable String description,
        @CustomType.Parameter("filterAction") @Nullable FilterAction filterAction,
        @CustomType.Parameter("filterCriteria") @Nullable FilterCriteria filterCriteria,
        @CustomType.Parameter("name") @Nullable String name) {
        this.arn = arn;
        this.description = description;
        this.filterAction = filterAction;
        this.filterCriteria = filterCriteria;
        this.name = name;
    }

    /**
     * @return Findings filter ARN.
     * 
     */
    public Optional<String> arn() {
        return Optional.ofNullable(this.arn);
    }
    /**
     * @return Findings filter description.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return Findings filter action.
     * 
     */
    public Optional<FilterAction> filterAction() {
        return Optional.ofNullable(this.filterAction);
    }
    /**
     * @return Findings filter criteria.
     * 
     */
    public Optional<FilterCriteria> filterCriteria() {
        return Optional.ofNullable(this.filterCriteria);
    }
    /**
     * @return Findings filter name.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFilterResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable String description;
        private @Nullable FilterAction filterAction;
        private @Nullable FilterCriteria filterCriteria;
        private @Nullable String name;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFilterResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.description = defaults.description;
    	      this.filterAction = defaults.filterAction;
    	      this.filterCriteria = defaults.filterCriteria;
    	      this.name = defaults.name;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        public Builder filterAction(@Nullable FilterAction filterAction) {
            this.filterAction = filterAction;
            return this;
        }
        public Builder filterCriteria(@Nullable FilterCriteria filterCriteria) {
            this.filterCriteria = filterCriteria;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }        public GetFilterResult build() {
            return new GetFilterResult(arn, description, filterAction, filterCriteria, name);
        }
    }
}
