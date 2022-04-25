// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.gcp.accesscontextmanager.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterStatusIngressPolicyIngressFromSourceArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServicePerimetersServicePerimeterStatusIngressPolicyIngressFromArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServicePerimetersServicePerimeterStatusIngressPolicyIngressFromArgs Empty = new ServicePerimetersServicePerimeterStatusIngressPolicyIngressFromArgs();

    /**
     * A list of identities that are allowed access through this `EgressPolicy`.
     * Should be in the format of email address. The email address should
     * represent individual user or service account only.
     * 
     */
    @Import(name="identities")
    private @Nullable Output<List<String>> identities;

    /**
     * @return A list of identities that are allowed access through this `EgressPolicy`.
     * Should be in the format of email address. The email address should
     * represent individual user or service account only.
     * 
     */
    public Optional<Output<List<String>>> identities() {
        return Optional.ofNullable(this.identities);
    }

    /**
     * Specifies the type of identities that are allowed access to outside the
     * perimeter. If left unspecified, then members of `identities` field will
     * be allowed access.
     * Possible values are `IDENTITY_TYPE_UNSPECIFIED`, `ANY_IDENTITY`, `ANY_USER_ACCOUNT`, and `ANY_SERVICE_ACCOUNT`.
     * 
     */
    @Import(name="identityType")
    private @Nullable Output<String> identityType;

    /**
     * @return Specifies the type of identities that are allowed access to outside the
     * perimeter. If left unspecified, then members of `identities` field will
     * be allowed access.
     * Possible values are `IDENTITY_TYPE_UNSPECIFIED`, `ANY_IDENTITY`, `ANY_USER_ACCOUNT`, and `ANY_SERVICE_ACCOUNT`.
     * 
     */
    public Optional<Output<String>> identityType() {
        return Optional.ofNullable(this.identityType);
    }

    /**
     * Sources that this `IngressPolicy` authorizes access from.
     * Structure is documented below.
     * 
     */
    @Import(name="sources")
    private @Nullable Output<List<ServicePerimetersServicePerimeterStatusIngressPolicyIngressFromSourceArgs>> sources;

    /**
     * @return Sources that this `IngressPolicy` authorizes access from.
     * Structure is documented below.
     * 
     */
    public Optional<Output<List<ServicePerimetersServicePerimeterStatusIngressPolicyIngressFromSourceArgs>>> sources() {
        return Optional.ofNullable(this.sources);
    }

    private ServicePerimetersServicePerimeterStatusIngressPolicyIngressFromArgs() {}

    private ServicePerimetersServicePerimeterStatusIngressPolicyIngressFromArgs(ServicePerimetersServicePerimeterStatusIngressPolicyIngressFromArgs $) {
        this.identities = $.identities;
        this.identityType = $.identityType;
        this.sources = $.sources;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServicePerimetersServicePerimeterStatusIngressPolicyIngressFromArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServicePerimetersServicePerimeterStatusIngressPolicyIngressFromArgs $;

        public Builder() {
            $ = new ServicePerimetersServicePerimeterStatusIngressPolicyIngressFromArgs();
        }

        public Builder(ServicePerimetersServicePerimeterStatusIngressPolicyIngressFromArgs defaults) {
            $ = new ServicePerimetersServicePerimeterStatusIngressPolicyIngressFromArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param identities A list of identities that are allowed access through this `EgressPolicy`.
         * Should be in the format of email address. The email address should
         * represent individual user or service account only.
         * 
         * @return builder
         * 
         */
        public Builder identities(@Nullable Output<List<String>> identities) {
            $.identities = identities;
            return this;
        }

        /**
         * @param identities A list of identities that are allowed access through this `EgressPolicy`.
         * Should be in the format of email address. The email address should
         * represent individual user or service account only.
         * 
         * @return builder
         * 
         */
        public Builder identities(List<String> identities) {
            return identities(Output.of(identities));
        }

        /**
         * @param identities A list of identities that are allowed access through this `EgressPolicy`.
         * Should be in the format of email address. The email address should
         * represent individual user or service account only.
         * 
         * @return builder
         * 
         */
        public Builder identities(String... identities) {
            return identities(List.of(identities));
        }

        /**
         * @param identityType Specifies the type of identities that are allowed access to outside the
         * perimeter. If left unspecified, then members of `identities` field will
         * be allowed access.
         * Possible values are `IDENTITY_TYPE_UNSPECIFIED`, `ANY_IDENTITY`, `ANY_USER_ACCOUNT`, and `ANY_SERVICE_ACCOUNT`.
         * 
         * @return builder
         * 
         */
        public Builder identityType(@Nullable Output<String> identityType) {
            $.identityType = identityType;
            return this;
        }

        /**
         * @param identityType Specifies the type of identities that are allowed access to outside the
         * perimeter. If left unspecified, then members of `identities` field will
         * be allowed access.
         * Possible values are `IDENTITY_TYPE_UNSPECIFIED`, `ANY_IDENTITY`, `ANY_USER_ACCOUNT`, and `ANY_SERVICE_ACCOUNT`.
         * 
         * @return builder
         * 
         */
        public Builder identityType(String identityType) {
            return identityType(Output.of(identityType));
        }

        /**
         * @param sources Sources that this `IngressPolicy` authorizes access from.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder sources(@Nullable Output<List<ServicePerimetersServicePerimeterStatusIngressPolicyIngressFromSourceArgs>> sources) {
            $.sources = sources;
            return this;
        }

        /**
         * @param sources Sources that this `IngressPolicy` authorizes access from.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder sources(List<ServicePerimetersServicePerimeterStatusIngressPolicyIngressFromSourceArgs> sources) {
            return sources(Output.of(sources));
        }

        /**
         * @param sources Sources that this `IngressPolicy` authorizes access from.
         * Structure is documented below.
         * 
         * @return builder
         * 
         */
        public Builder sources(ServicePerimetersServicePerimeterStatusIngressPolicyIngressFromSourceArgs... sources) {
            return sources(List.of(sources));
        }

        public ServicePerimetersServicePerimeterStatusIngressPolicyIngressFromArgs build() {
            return $;
        }
    }

}
