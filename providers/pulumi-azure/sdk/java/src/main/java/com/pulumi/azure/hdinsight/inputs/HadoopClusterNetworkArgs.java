// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.hdinsight.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class HadoopClusterNetworkArgs extends com.pulumi.resources.ResourceArgs {

    public static final HadoopClusterNetworkArgs Empty = new HadoopClusterNetworkArgs();

    /**
     * The direction of the resource provider connection. Possible values include `Inbound` or `Outbound`. Defaults to `Inbound`. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="connectionDirection")
    private @Nullable Output<String> connectionDirection;

    /**
     * @return The direction of the resource provider connection. Possible values include `Inbound` or `Outbound`. Defaults to `Inbound`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> connectionDirection() {
        return Optional.ofNullable(this.connectionDirection);
    }

    /**
     * Is the private link enabled? Possible values include `True` or `False`. Defaults to `False`. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="privateLinkEnabled")
    private @Nullable Output<Boolean> privateLinkEnabled;

    /**
     * @return Is the private link enabled? Possible values include `True` or `False`. Defaults to `False`. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<Boolean>> privateLinkEnabled() {
        return Optional.ofNullable(this.privateLinkEnabled);
    }

    private HadoopClusterNetworkArgs() {}

    private HadoopClusterNetworkArgs(HadoopClusterNetworkArgs $) {
        this.connectionDirection = $.connectionDirection;
        this.privateLinkEnabled = $.privateLinkEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(HadoopClusterNetworkArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private HadoopClusterNetworkArgs $;

        public Builder() {
            $ = new HadoopClusterNetworkArgs();
        }

        public Builder(HadoopClusterNetworkArgs defaults) {
            $ = new HadoopClusterNetworkArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param connectionDirection The direction of the resource provider connection. Possible values include `Inbound` or `Outbound`. Defaults to `Inbound`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder connectionDirection(@Nullable Output<String> connectionDirection) {
            $.connectionDirection = connectionDirection;
            return this;
        }

        /**
         * @param connectionDirection The direction of the resource provider connection. Possible values include `Inbound` or `Outbound`. Defaults to `Inbound`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder connectionDirection(String connectionDirection) {
            return connectionDirection(Output.of(connectionDirection));
        }

        /**
         * @param privateLinkEnabled Is the private link enabled? Possible values include `True` or `False`. Defaults to `False`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder privateLinkEnabled(@Nullable Output<Boolean> privateLinkEnabled) {
            $.privateLinkEnabled = privateLinkEnabled;
            return this;
        }

        /**
         * @param privateLinkEnabled Is the private link enabled? Possible values include `True` or `False`. Defaults to `False`. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder privateLinkEnabled(Boolean privateLinkEnabled) {
            return privateLinkEnabled(Output.of(privateLinkEnabled));
        }

        public HadoopClusterNetworkArgs build() {
            return $;
        }
    }

}
