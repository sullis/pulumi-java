// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.inputs;

import com.pulumi.aws.ec2.inputs.GetDedicatedHostFilterArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDedicatedHostArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetDedicatedHostArgs Empty = new GetDedicatedHostArgs();

    /**
     * Configuration block. Detailed below.
     * 
     */
    @Import(name="filters")
    private @Nullable Output<List<GetDedicatedHostFilterArgs>> filters;

    /**
     * @return Configuration block. Detailed below.
     * 
     */
    public Optional<Output<List<GetDedicatedHostFilterArgs>>> filters() {
        return Optional.ofNullable(this.filters);
    }

    /**
     * The ID of the Dedicated Host.
     * 
     */
    @Import(name="hostId")
    private @Nullable Output<String> hostId;

    /**
     * @return The ID of the Dedicated Host.
     * 
     */
    public Optional<Output<String>> hostId() {
        return Optional.ofNullable(this.hostId);
    }

    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GetDedicatedHostArgs() {}

    private GetDedicatedHostArgs(GetDedicatedHostArgs $) {
        this.filters = $.filters;
        this.hostId = $.hostId;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetDedicatedHostArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetDedicatedHostArgs $;

        public Builder() {
            $ = new GetDedicatedHostArgs();
        }

        public Builder(GetDedicatedHostArgs defaults) {
            $ = new GetDedicatedHostArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param filters Configuration block. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder filters(@Nullable Output<List<GetDedicatedHostFilterArgs>> filters) {
            $.filters = filters;
            return this;
        }

        /**
         * @param filters Configuration block. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder filters(List<GetDedicatedHostFilterArgs> filters) {
            return filters(Output.of(filters));
        }

        /**
         * @param filters Configuration block. Detailed below.
         * 
         * @return builder
         * 
         */
        public Builder filters(GetDedicatedHostFilterArgs... filters) {
            return filters(List.of(filters));
        }

        /**
         * @param hostId The ID of the Dedicated Host.
         * 
         * @return builder
         * 
         */
        public Builder hostId(@Nullable Output<String> hostId) {
            $.hostId = hostId;
            return this;
        }

        /**
         * @param hostId The ID of the Dedicated Host.
         * 
         * @return builder
         * 
         */
        public Builder hostId(String hostId) {
            return hostId(Output.of(hostId));
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public GetDedicatedHostArgs build() {
            return $;
        }
    }

}
