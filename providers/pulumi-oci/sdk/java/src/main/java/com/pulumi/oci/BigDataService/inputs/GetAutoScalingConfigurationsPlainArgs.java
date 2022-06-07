// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.BigDataService.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.oci.BigDataService.inputs.GetAutoScalingConfigurationsFilter;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAutoScalingConfigurationsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAutoScalingConfigurationsPlainArgs Empty = new GetAutoScalingConfigurationsPlainArgs();

    @Import(name="bdsInstanceId", required=true)
    private String bdsInstanceId;

    public String bdsInstanceId() {
        return this.bdsInstanceId;
    }

    @Import(name="compartmentId", required=true)
    private String compartmentId;

    public String compartmentId() {
        return this.compartmentId;
    }

    @Import(name="displayName")
    private @Nullable String displayName;

    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }

    @Import(name="filters")
    private @Nullable List<GetAutoScalingConfigurationsFilter> filters;

    public Optional<List<GetAutoScalingConfigurationsFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    @Import(name="state")
    private @Nullable String state;

    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }

    private GetAutoScalingConfigurationsPlainArgs() {}

    private GetAutoScalingConfigurationsPlainArgs(GetAutoScalingConfigurationsPlainArgs $) {
        this.bdsInstanceId = $.bdsInstanceId;
        this.compartmentId = $.compartmentId;
        this.displayName = $.displayName;
        this.filters = $.filters;
        this.state = $.state;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAutoScalingConfigurationsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAutoScalingConfigurationsPlainArgs $;

        public Builder() {
            $ = new GetAutoScalingConfigurationsPlainArgs();
        }

        public Builder(GetAutoScalingConfigurationsPlainArgs defaults) {
            $ = new GetAutoScalingConfigurationsPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder bdsInstanceId(String bdsInstanceId) {
            $.bdsInstanceId = bdsInstanceId;
            return this;
        }

        public Builder compartmentId(String compartmentId) {
            $.compartmentId = compartmentId;
            return this;
        }

        public Builder displayName(@Nullable String displayName) {
            $.displayName = displayName;
            return this;
        }

        public Builder filters(@Nullable List<GetAutoScalingConfigurationsFilter> filters) {
            $.filters = filters;
            return this;
        }

        public Builder filters(GetAutoScalingConfigurationsFilter... filters) {
            return filters(List.of(filters));
        }

        public Builder state(@Nullable String state) {
            $.state = state;
            return this;
        }

        public GetAutoScalingConfigurationsPlainArgs build() {
            $.bdsInstanceId = Objects.requireNonNull($.bdsInstanceId, "expected parameter 'bdsInstanceId' to be non-null");
            $.compartmentId = Objects.requireNonNull($.compartmentId, "expected parameter 'compartmentId' to be non-null");
            return $;
        }
    }

}
