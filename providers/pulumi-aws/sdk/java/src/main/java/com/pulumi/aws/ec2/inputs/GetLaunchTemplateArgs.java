// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.aws.ec2.inputs.GetLaunchTemplateFilter;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetLaunchTemplateArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetLaunchTemplateArgs Empty = new GetLaunchTemplateArgs();

    /**
     * Configuration block(s) for filtering. Detailed below.
     * 
     */
    @Import(name="filters")
    private @Nullable List<GetLaunchTemplateFilter> filters;

    /**
     * @return Configuration block(s) for filtering. Detailed below.
     * 
     */
    public Optional<List<GetLaunchTemplateFilter>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * The ID of the specific launch template to retrieve.
     * 
     */
    @Import(name="id")
    private @Nullable String id;

    /**
     * @return The ID of the specific launch template to retrieve.
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }

    /**
     * The name of the filter field. Valid values can be found in the [EC2 DescribeLaunchTemplates API Reference](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeLaunchTemplates.html).
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return The name of the filter field. Valid values can be found in the [EC2 DescribeLaunchTemplates API Reference](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeLaunchTemplates.html).
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A map of tags, each pair of which must exactly match a pair on the desired Launch Template.
     * 
     */
    @Import(name="tags")
    private @Nullable Map<String,String> tags;

    /**
     * @return A map of tags, each pair of which must exactly match a pair on the desired Launch Template.
     * 
     */
    public Optional<Map<String,String>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GetLaunchTemplateArgs() {}

    private GetLaunchTemplateArgs(GetLaunchTemplateArgs $) {
        this.filters = $.filters;
        this.id = $.id;
        this.name = $.name;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetLaunchTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetLaunchTemplateArgs $;

        public Builder() {
            $ = new GetLaunchTemplateArgs();
        }

        public Builder(GetLaunchTemplateArgs defaults) {
            $ = new GetLaunchTemplateArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param filters Configuration block(s) for filtering. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder filters(@Nullable List<GetLaunchTemplateFilter> filters) {
            $.filters = filters;
            return this;
        }

        /**
         * @param filters Configuration block(s) for filtering. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder filters(GetLaunchTemplateFilter... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param id The ID of the specific launch template to retrieve.
         * 
         * @return builder
         * 
         */
        public Builder id(@Nullable String id) {
            $.id = id;
            return this;
        }

        /**
         * @param name The name of the filter field. Valid values can be found in the [EC2 DescribeLaunchTemplates API Reference](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_DescribeLaunchTemplates.html).
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        /**
         * @param tags A map of tags, each pair of which must exactly match a pair on the desired Launch Template.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Map<String,String> tags) {
            $.tags = tags;
            return this;
        }

        public GetLaunchTemplateArgs build() {
            return $;
        }
    }

}
