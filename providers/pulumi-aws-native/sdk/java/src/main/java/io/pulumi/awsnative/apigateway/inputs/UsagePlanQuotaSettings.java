// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.apigateway.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class UsagePlanQuotaSettings extends io.pulumi.resources.InvokeArgs {

    public static final UsagePlanQuotaSettings Empty = new UsagePlanQuotaSettings();

    @InputImport(name="limit")
    private final @Nullable Integer limit;

    public Optional<Integer> getLimit() {
        return this.limit == null ? Optional.empty() : Optional.ofNullable(this.limit);
    }

    @InputImport(name="offset")
    private final @Nullable Integer offset;

    public Optional<Integer> getOffset() {
        return this.offset == null ? Optional.empty() : Optional.ofNullable(this.offset);
    }

    @InputImport(name="period")
    private final @Nullable String period;

    public Optional<String> getPeriod() {
        return this.period == null ? Optional.empty() : Optional.ofNullable(this.period);
    }

    public UsagePlanQuotaSettings(
        @Nullable Integer limit,
        @Nullable Integer offset,
        @Nullable String period) {
        this.limit = limit;
        this.offset = offset;
        this.period = period;
    }

    private UsagePlanQuotaSettings() {
        this.limit = null;
        this.offset = null;
        this.period = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UsagePlanQuotaSettings defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer limit;
        private @Nullable Integer offset;
        private @Nullable String period;

        public Builder() {
    	      // Empty
        }

        public Builder(UsagePlanQuotaSettings defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.limit = defaults.limit;
    	      this.offset = defaults.offset;
    	      this.period = defaults.period;
        }

        public Builder setLimit(@Nullable Integer limit) {
            this.limit = limit;
            return this;
        }

        public Builder setOffset(@Nullable Integer offset) {
            this.offset = offset;
            return this;
        }

        public Builder setPeriod(@Nullable String period) {
            this.period = period;
            return this;
        }

        public UsagePlanQuotaSettings build() {
            return new UsagePlanQuotaSettings(limit, offset, period);
        }
    }
}
