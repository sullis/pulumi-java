// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.containerinstance.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * DNS configuration for the container group.
 * 
 */
public final class DnsConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final DnsConfigurationArgs Empty = new DnsConfigurationArgs();

    /**
     * The DNS servers for the container group.
     * 
     */
    @Import(name="nameServers", required=true)
    private Output<List<String>> nameServers;

    /**
     * @return The DNS servers for the container group.
     * 
     */
    public Output<List<String>> nameServers() {
        return this.nameServers;
    }

    /**
     * The DNS options for the container group.
     * 
     */
    @Import(name="options")
    private @Nullable Output<String> options;

    /**
     * @return The DNS options for the container group.
     * 
     */
    public Optional<Output<String>> options() {
        return Optional.ofNullable(this.options);
    }

    /**
     * The DNS search domains for hostname lookup in the container group.
     * 
     */
    @Import(name="searchDomains")
    private @Nullable Output<String> searchDomains;

    /**
     * @return The DNS search domains for hostname lookup in the container group.
     * 
     */
    public Optional<Output<String>> searchDomains() {
        return Optional.ofNullable(this.searchDomains);
    }

    private DnsConfigurationArgs() {}

    private DnsConfigurationArgs(DnsConfigurationArgs $) {
        this.nameServers = $.nameServers;
        this.options = $.options;
        this.searchDomains = $.searchDomains;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DnsConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DnsConfigurationArgs $;

        public Builder() {
            $ = new DnsConfigurationArgs();
        }

        public Builder(DnsConfigurationArgs defaults) {
            $ = new DnsConfigurationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param nameServers The DNS servers for the container group.
         * 
         * @return builder
         * 
         */
        public Builder nameServers(Output<List<String>> nameServers) {
            $.nameServers = nameServers;
            return this;
        }

        /**
         * @param nameServers The DNS servers for the container group.
         * 
         * @return builder
         * 
         */
        public Builder nameServers(List<String> nameServers) {
            return nameServers(Output.of(nameServers));
        }

        /**
         * @param nameServers The DNS servers for the container group.
         * 
         * @return builder
         * 
         */
        public Builder nameServers(String... nameServers) {
            return nameServers(List.of(nameServers));
        }

        /**
         * @param options The DNS options for the container group.
         * 
         * @return builder
         * 
         */
        public Builder options(@Nullable Output<String> options) {
            $.options = options;
            return this;
        }

        /**
         * @param options The DNS options for the container group.
         * 
         * @return builder
         * 
         */
        public Builder options(String options) {
            return options(Output.of(options));
        }

        /**
         * @param searchDomains The DNS search domains for hostname lookup in the container group.
         * 
         * @return builder
         * 
         */
        public Builder searchDomains(@Nullable Output<String> searchDomains) {
            $.searchDomains = searchDomains;
            return this;
        }

        /**
         * @param searchDomains The DNS search domains for hostname lookup in the container group.
         * 
         * @return builder
         * 
         */
        public Builder searchDomains(String searchDomains) {
            return searchDomains(Output.of(searchDomains));
        }

        public DnsConfigurationArgs build() {
            $.nameServers = Objects.requireNonNull($.nameServers, "expected parameter 'nameServers' to be non-null");
            return $;
        }
    }

}
