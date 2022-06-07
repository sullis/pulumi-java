// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.networkmanager.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetSitesArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetSitesArgs Empty = new GetSitesArgs();

    /**
     * The ID of the Global Network of the sites to retrieve.
     * 
     */
    @Import(name="globalNetworkId", required=true)
    private Output<String> globalNetworkId;

    /**
     * @return The ID of the Global Network of the sites to retrieve.
     * 
     */
    public Output<String> globalNetworkId() {
        return this.globalNetworkId;
    }

    /**
     * Restricts the list to the sites with these tags.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return Restricts the list to the sites with these tags.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private GetSitesArgs() {}

    private GetSitesArgs(GetSitesArgs $) {
        this.globalNetworkId = $.globalNetworkId;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetSitesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetSitesArgs $;

        public Builder() {
            $ = new GetSitesArgs();
        }

        public Builder(GetSitesArgs defaults) {
            $ = new GetSitesArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param globalNetworkId The ID of the Global Network of the sites to retrieve.
         * 
         * @return builder
         * 
         */
        public Builder globalNetworkId(Output<String> globalNetworkId) {
            $.globalNetworkId = globalNetworkId;
            return this;
        }

        /**
         * @param globalNetworkId The ID of the Global Network of the sites to retrieve.
         * 
         * @return builder
         * 
         */
        public Builder globalNetworkId(String globalNetworkId) {
            return globalNetworkId(Output.of(globalNetworkId));
        }

        /**
         * @param tags Restricts the list to the sites with these tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Restricts the list to the sites with these tags.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        public GetSitesArgs build() {
            $.globalNetworkId = Objects.requireNonNull($.globalNetworkId, "expected parameter 'globalNetworkId' to be non-null");
            return $;
        }
    }

}
