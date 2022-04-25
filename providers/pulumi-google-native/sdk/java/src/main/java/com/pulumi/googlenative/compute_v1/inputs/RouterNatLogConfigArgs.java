// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.compute_v1.enums.RouterNatLogConfigFilter;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Configuration of logging on a NAT.
 * 
 */
public final class RouterNatLogConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final RouterNatLogConfigArgs Empty = new RouterNatLogConfigArgs();

    /**
     * Indicates whether or not to export logs. This is false by default.
     * 
     */
    @Import(name="enable")
    private @Nullable Output<Boolean> enable;

    /**
     * @return Indicates whether or not to export logs. This is false by default.
     * 
     */
    public Optional<Output<Boolean>> enable() {
        return Optional.ofNullable(this.enable);
    }

    /**
     * Specify the desired filtering of logs on this NAT. If unspecified, logs are exported for all connections handled by this NAT. This option can take one of the following values: - ERRORS_ONLY: Export logs only for connection failures. - TRANSLATIONS_ONLY: Export logs only for successful connections. - ALL: Export logs for all connections, successful and unsuccessful.
     * 
     */
    @Import(name="filter")
    private @Nullable Output<RouterNatLogConfigFilter> filter;

    /**
     * @return Specify the desired filtering of logs on this NAT. If unspecified, logs are exported for all connections handled by this NAT. This option can take one of the following values: - ERRORS_ONLY: Export logs only for connection failures. - TRANSLATIONS_ONLY: Export logs only for successful connections. - ALL: Export logs for all connections, successful and unsuccessful.
     * 
     */
    public Optional<Output<RouterNatLogConfigFilter>> filter() {
        return Optional.ofNullable(this.filter);
    }

    private RouterNatLogConfigArgs() {}

    private RouterNatLogConfigArgs(RouterNatLogConfigArgs $) {
        this.enable = $.enable;
        this.filter = $.filter;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RouterNatLogConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RouterNatLogConfigArgs $;

        public Builder() {
            $ = new RouterNatLogConfigArgs();
        }

        public Builder(RouterNatLogConfigArgs defaults) {
            $ = new RouterNatLogConfigArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enable Indicates whether or not to export logs. This is false by default.
         * 
         * @return builder
         * 
         */
        public Builder enable(@Nullable Output<Boolean> enable) {
            $.enable = enable;
            return this;
        }

        /**
         * @param enable Indicates whether or not to export logs. This is false by default.
         * 
         * @return builder
         * 
         */
        public Builder enable(Boolean enable) {
            return enable(Output.of(enable));
        }

        /**
         * @param filter Specify the desired filtering of logs on this NAT. If unspecified, logs are exported for all connections handled by this NAT. This option can take one of the following values: - ERRORS_ONLY: Export logs only for connection failures. - TRANSLATIONS_ONLY: Export logs only for successful connections. - ALL: Export logs for all connections, successful and unsuccessful.
         * 
         * @return builder
         * 
         */
        public Builder filter(@Nullable Output<RouterNatLogConfigFilter> filter) {
            $.filter = filter;
            return this;
        }

        /**
         * @param filter Specify the desired filtering of logs on this NAT. If unspecified, logs are exported for all connections handled by this NAT. This option can take one of the following values: - ERRORS_ONLY: Export logs only for connection failures. - TRANSLATIONS_ONLY: Export logs only for successful connections. - ALL: Export logs for all connections, successful and unsuccessful.
         * 
         * @return builder
         * 
         */
        public Builder filter(RouterNatLogConfigFilter filter) {
            return filter(Output.of(filter));
        }

        public RouterNatLogConfigArgs build() {
            return $;
        }
    }

}
