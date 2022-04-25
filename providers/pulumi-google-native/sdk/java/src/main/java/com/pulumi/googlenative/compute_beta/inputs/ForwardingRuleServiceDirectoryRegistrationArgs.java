// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.compute_beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes the auto-registration of the Forwarding Rule to Service Directory. The region and project of the Service Directory resource generated from this registration will be the same as this Forwarding Rule.
 * 
 */
public final class ForwardingRuleServiceDirectoryRegistrationArgs extends com.pulumi.resources.ResourceArgs {

    public static final ForwardingRuleServiceDirectoryRegistrationArgs Empty = new ForwardingRuleServiceDirectoryRegistrationArgs();

    /**
     * Service Directory namespace to register the forwarding rule under.
     * 
     */
    @Import(name="namespace")
    private @Nullable Output<String> namespace;

    /**
     * @return Service Directory namespace to register the forwarding rule under.
     * 
     */
    public Optional<Output<String>> namespace() {
        return Optional.ofNullable(this.namespace);
    }

    /**
     * Service Directory service to register the forwarding rule under.
     * 
     */
    @Import(name="service")
    private @Nullable Output<String> service;

    /**
     * @return Service Directory service to register the forwarding rule under.
     * 
     */
    public Optional<Output<String>> service() {
        return Optional.ofNullable(this.service);
    }

    /**
     * [Optional] Service Directory region to register this global forwarding rule under. Default to &#34;us-central1&#34;. Only used for PSC for Google APIs. All PSC for Google APIs Forwarding Rules on the same network should use the same Service Directory region.
     * 
     */
    @Import(name="serviceDirectoryRegion")
    private @Nullable Output<String> serviceDirectoryRegion;

    /**
     * @return [Optional] Service Directory region to register this global forwarding rule under. Default to &#34;us-central1&#34;. Only used for PSC for Google APIs. All PSC for Google APIs Forwarding Rules on the same network should use the same Service Directory region.
     * 
     */
    public Optional<Output<String>> serviceDirectoryRegion() {
        return Optional.ofNullable(this.serviceDirectoryRegion);
    }

    private ForwardingRuleServiceDirectoryRegistrationArgs() {}

    private ForwardingRuleServiceDirectoryRegistrationArgs(ForwardingRuleServiceDirectoryRegistrationArgs $) {
        this.namespace = $.namespace;
        this.service = $.service;
        this.serviceDirectoryRegion = $.serviceDirectoryRegion;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ForwardingRuleServiceDirectoryRegistrationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ForwardingRuleServiceDirectoryRegistrationArgs $;

        public Builder() {
            $ = new ForwardingRuleServiceDirectoryRegistrationArgs();
        }

        public Builder(ForwardingRuleServiceDirectoryRegistrationArgs defaults) {
            $ = new ForwardingRuleServiceDirectoryRegistrationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param namespace Service Directory namespace to register the forwarding rule under.
         * 
         * @return builder
         * 
         */
        public Builder namespace(@Nullable Output<String> namespace) {
            $.namespace = namespace;
            return this;
        }

        /**
         * @param namespace Service Directory namespace to register the forwarding rule under.
         * 
         * @return builder
         * 
         */
        public Builder namespace(String namespace) {
            return namespace(Output.of(namespace));
        }

        /**
         * @param service Service Directory service to register the forwarding rule under.
         * 
         * @return builder
         * 
         */
        public Builder service(@Nullable Output<String> service) {
            $.service = service;
            return this;
        }

        /**
         * @param service Service Directory service to register the forwarding rule under.
         * 
         * @return builder
         * 
         */
        public Builder service(String service) {
            return service(Output.of(service));
        }

        /**
         * @param serviceDirectoryRegion [Optional] Service Directory region to register this global forwarding rule under. Default to &#34;us-central1&#34;. Only used for PSC for Google APIs. All PSC for Google APIs Forwarding Rules on the same network should use the same Service Directory region.
         * 
         * @return builder
         * 
         */
        public Builder serviceDirectoryRegion(@Nullable Output<String> serviceDirectoryRegion) {
            $.serviceDirectoryRegion = serviceDirectoryRegion;
            return this;
        }

        /**
         * @param serviceDirectoryRegion [Optional] Service Directory region to register this global forwarding rule under. Default to &#34;us-central1&#34;. Only used for PSC for Google APIs. All PSC for Google APIs Forwarding Rules on the same network should use the same Service Directory region.
         * 
         * @return builder
         * 
         */
        public Builder serviceDirectoryRegion(String serviceDirectoryRegion) {
            return serviceDirectoryRegion(Output.of(serviceDirectoryRegion));
        }

        public ForwardingRuleServiceDirectoryRegistrationArgs build() {
            return $;
        }
    }

}
