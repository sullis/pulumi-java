// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.accesscontextmanager_v1;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.accesscontextmanager_v1.enums.ServicePerimeterPerimeterType;
import com.pulumi.googlenative.accesscontextmanager_v1.inputs.ServicePerimeterConfigArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServicePerimeterArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServicePerimeterArgs Empty = new ServicePerimeterArgs();

    @Import(name="accessPolicyId", required=true)
    private Output<String> accessPolicyId;

    public Output<String> accessPolicyId() {
        return this.accessPolicyId;
    }

    /**
     * Description of the `ServicePerimeter` and its use. Does not affect behavior.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description of the `ServicePerimeter` and its use. Does not affect behavior.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Resource name for the ServicePerimeter. The `short_name` component must begin with a letter and only include alphanumeric and &#39;_&#39;. Format: `accessPolicies/{access_policy}/servicePerimeters/{service_perimeter}`
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Resource name for the ServicePerimeter. The `short_name` component must begin with a letter and only include alphanumeric and &#39;_&#39;. Format: `accessPolicies/{access_policy}/servicePerimeters/{service_perimeter}`
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Perimeter type indicator. A single project is allowed to be a member of single regular perimeter, but multiple service perimeter bridges. A project cannot be a included in a perimeter bridge without being included in regular perimeter. For perimeter bridges, the restricted service list as well as access level lists must be empty.
     * 
     */
    @Import(name="perimeterType")
    private @Nullable Output<ServicePerimeterPerimeterType> perimeterType;

    /**
     * @return Perimeter type indicator. A single project is allowed to be a member of single regular perimeter, but multiple service perimeter bridges. A project cannot be a included in a perimeter bridge without being included in regular perimeter. For perimeter bridges, the restricted service list as well as access level lists must be empty.
     * 
     */
    public Optional<Output<ServicePerimeterPerimeterType>> perimeterType() {
        return Optional.ofNullable(this.perimeterType);
    }

    /**
     * Proposed (or dry run) ServicePerimeter configuration. This configuration allows to specify and test ServicePerimeter configuration without enforcing actual access restrictions. Only allowed to be set when the &#34;use_explicit_dry_run_spec&#34; flag is set.
     * 
     */
    @Import(name="spec")
    private @Nullable Output<ServicePerimeterConfigArgs> spec;

    /**
     * @return Proposed (or dry run) ServicePerimeter configuration. This configuration allows to specify and test ServicePerimeter configuration without enforcing actual access restrictions. Only allowed to be set when the &#34;use_explicit_dry_run_spec&#34; flag is set.
     * 
     */
    public Optional<Output<ServicePerimeterConfigArgs>> spec() {
        return Optional.ofNullable(this.spec);
    }

    /**
     * Current ServicePerimeter configuration. Specifies sets of resources, restricted services and access levels that determine perimeter content and boundaries.
     * 
     */
    @Import(name="status")
    private @Nullable Output<ServicePerimeterConfigArgs> status;

    /**
     * @return Current ServicePerimeter configuration. Specifies sets of resources, restricted services and access levels that determine perimeter content and boundaries.
     * 
     */
    public Optional<Output<ServicePerimeterConfigArgs>> status() {
        return Optional.ofNullable(this.status);
    }

    /**
     * Human readable title. Must be unique within the Policy.
     * 
     */
    @Import(name="title")
    private @Nullable Output<String> title;

    /**
     * @return Human readable title. Must be unique within the Policy.
     * 
     */
    public Optional<Output<String>> title() {
        return Optional.ofNullable(this.title);
    }

    /**
     * Use explicit dry run spec flag. Ordinarily, a dry-run spec implicitly exists for all Service Perimeters, and that spec is identical to the status for those Service Perimeters. When this flag is set, it inhibits the generation of the implicit spec, thereby allowing the user to explicitly provide a configuration (&#34;spec&#34;) to use in a dry-run version of the Service Perimeter. This allows the user to test changes to the enforced config (&#34;status&#34;) without actually enforcing them. This testing is done through analyzing the differences between currently enforced and suggested restrictions. use_explicit_dry_run_spec must bet set to True if any of the fields in the spec are set to non-default values.
     * 
     */
    @Import(name="useExplicitDryRunSpec")
    private @Nullable Output<Boolean> useExplicitDryRunSpec;

    /**
     * @return Use explicit dry run spec flag. Ordinarily, a dry-run spec implicitly exists for all Service Perimeters, and that spec is identical to the status for those Service Perimeters. When this flag is set, it inhibits the generation of the implicit spec, thereby allowing the user to explicitly provide a configuration (&#34;spec&#34;) to use in a dry-run version of the Service Perimeter. This allows the user to test changes to the enforced config (&#34;status&#34;) without actually enforcing them. This testing is done through analyzing the differences between currently enforced and suggested restrictions. use_explicit_dry_run_spec must bet set to True if any of the fields in the spec are set to non-default values.
     * 
     */
    public Optional<Output<Boolean>> useExplicitDryRunSpec() {
        return Optional.ofNullable(this.useExplicitDryRunSpec);
    }

    private ServicePerimeterArgs() {}

    private ServicePerimeterArgs(ServicePerimeterArgs $) {
        this.accessPolicyId = $.accessPolicyId;
        this.description = $.description;
        this.name = $.name;
        this.perimeterType = $.perimeterType;
        this.spec = $.spec;
        this.status = $.status;
        this.title = $.title;
        this.useExplicitDryRunSpec = $.useExplicitDryRunSpec;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServicePerimeterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServicePerimeterArgs $;

        public Builder() {
            $ = new ServicePerimeterArgs();
        }

        public Builder(ServicePerimeterArgs defaults) {
            $ = new ServicePerimeterArgs(Objects.requireNonNull(defaults));
        }

        public Builder accessPolicyId(Output<String> accessPolicyId) {
            $.accessPolicyId = accessPolicyId;
            return this;
        }

        public Builder accessPolicyId(String accessPolicyId) {
            return accessPolicyId(Output.of(accessPolicyId));
        }

        /**
         * @param description Description of the `ServicePerimeter` and its use. Does not affect behavior.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of the `ServicePerimeter` and its use. Does not affect behavior.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param name Resource name for the ServicePerimeter. The `short_name` component must begin with a letter and only include alphanumeric and &#39;_&#39;. Format: `accessPolicies/{access_policy}/servicePerimeters/{service_perimeter}`
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Resource name for the ServicePerimeter. The `short_name` component must begin with a letter and only include alphanumeric and &#39;_&#39;. Format: `accessPolicies/{access_policy}/servicePerimeters/{service_perimeter}`
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param perimeterType Perimeter type indicator. A single project is allowed to be a member of single regular perimeter, but multiple service perimeter bridges. A project cannot be a included in a perimeter bridge without being included in regular perimeter. For perimeter bridges, the restricted service list as well as access level lists must be empty.
         * 
         * @return builder
         * 
         */
        public Builder perimeterType(@Nullable Output<ServicePerimeterPerimeterType> perimeterType) {
            $.perimeterType = perimeterType;
            return this;
        }

        /**
         * @param perimeterType Perimeter type indicator. A single project is allowed to be a member of single regular perimeter, but multiple service perimeter bridges. A project cannot be a included in a perimeter bridge without being included in regular perimeter. For perimeter bridges, the restricted service list as well as access level lists must be empty.
         * 
         * @return builder
         * 
         */
        public Builder perimeterType(ServicePerimeterPerimeterType perimeterType) {
            return perimeterType(Output.of(perimeterType));
        }

        /**
         * @param spec Proposed (or dry run) ServicePerimeter configuration. This configuration allows to specify and test ServicePerimeter configuration without enforcing actual access restrictions. Only allowed to be set when the &#34;use_explicit_dry_run_spec&#34; flag is set.
         * 
         * @return builder
         * 
         */
        public Builder spec(@Nullable Output<ServicePerimeterConfigArgs> spec) {
            $.spec = spec;
            return this;
        }

        /**
         * @param spec Proposed (or dry run) ServicePerimeter configuration. This configuration allows to specify and test ServicePerimeter configuration without enforcing actual access restrictions. Only allowed to be set when the &#34;use_explicit_dry_run_spec&#34; flag is set.
         * 
         * @return builder
         * 
         */
        public Builder spec(ServicePerimeterConfigArgs spec) {
            return spec(Output.of(spec));
        }

        /**
         * @param status Current ServicePerimeter configuration. Specifies sets of resources, restricted services and access levels that determine perimeter content and boundaries.
         * 
         * @return builder
         * 
         */
        public Builder status(@Nullable Output<ServicePerimeterConfigArgs> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status Current ServicePerimeter configuration. Specifies sets of resources, restricted services and access levels that determine perimeter content and boundaries.
         * 
         * @return builder
         * 
         */
        public Builder status(ServicePerimeterConfigArgs status) {
            return status(Output.of(status));
        }

        /**
         * @param title Human readable title. Must be unique within the Policy.
         * 
         * @return builder
         * 
         */
        public Builder title(@Nullable Output<String> title) {
            $.title = title;
            return this;
        }

        /**
         * @param title Human readable title. Must be unique within the Policy.
         * 
         * @return builder
         * 
         */
        public Builder title(String title) {
            return title(Output.of(title));
        }

        /**
         * @param useExplicitDryRunSpec Use explicit dry run spec flag. Ordinarily, a dry-run spec implicitly exists for all Service Perimeters, and that spec is identical to the status for those Service Perimeters. When this flag is set, it inhibits the generation of the implicit spec, thereby allowing the user to explicitly provide a configuration (&#34;spec&#34;) to use in a dry-run version of the Service Perimeter. This allows the user to test changes to the enforced config (&#34;status&#34;) without actually enforcing them. This testing is done through analyzing the differences between currently enforced and suggested restrictions. use_explicit_dry_run_spec must bet set to True if any of the fields in the spec are set to non-default values.
         * 
         * @return builder
         * 
         */
        public Builder useExplicitDryRunSpec(@Nullable Output<Boolean> useExplicitDryRunSpec) {
            $.useExplicitDryRunSpec = useExplicitDryRunSpec;
            return this;
        }

        /**
         * @param useExplicitDryRunSpec Use explicit dry run spec flag. Ordinarily, a dry-run spec implicitly exists for all Service Perimeters, and that spec is identical to the status for those Service Perimeters. When this flag is set, it inhibits the generation of the implicit spec, thereby allowing the user to explicitly provide a configuration (&#34;spec&#34;) to use in a dry-run version of the Service Perimeter. This allows the user to test changes to the enforced config (&#34;status&#34;) without actually enforcing them. This testing is done through analyzing the differences between currently enforced and suggested restrictions. use_explicit_dry_run_spec must bet set to True if any of the fields in the spec are set to non-default values.
         * 
         * @return builder
         * 
         */
        public Builder useExplicitDryRunSpec(Boolean useExplicitDryRunSpec) {
            return useExplicitDryRunSpec(Output.of(useExplicitDryRunSpec));
        }

        public ServicePerimeterArgs build() {
            $.accessPolicyId = Objects.requireNonNull($.accessPolicyId, "expected parameter 'accessPolicyId' to be non-null");
            return $;
        }
    }

}
