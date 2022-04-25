// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.accesscontextmanager_v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.googlenative.accesscontextmanager_v1.inputs.ApiOperationArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Defines the conditions under which an IngressPolicy matches a request. Conditions are based on information about the ApiOperation intended to be performed on the target resource of the request. The request must satisfy what is defined in `operations` AND `resources` in order to match.
 * 
 */
public final class IngressToArgs extends com.pulumi.resources.ResourceArgs {

    public static final IngressToArgs Empty = new IngressToArgs();

    /**
     * A list of ApiOperations allowed to be performed by the sources specified in corresponding IngressFrom in this ServicePerimeter.
     * 
     */
    @Import(name="operations")
    private @Nullable Output<List<ApiOperationArgs>> operations;

    /**
     * @return A list of ApiOperations allowed to be performed by the sources specified in corresponding IngressFrom in this ServicePerimeter.
     * 
     */
    public Optional<Output<List<ApiOperationArgs>>> operations() {
        return Optional.ofNullable(this.operations);
    }

    /**
     * A list of resources, currently only projects in the form `projects/`, protected by this ServicePerimeter that are allowed to be accessed by sources defined in the corresponding IngressFrom. If a single `*` is specified, then access to all resources inside the perimeter are allowed.
     * 
     */
    @Import(name="resources")
    private @Nullable Output<List<String>> resources;

    /**
     * @return A list of resources, currently only projects in the form `projects/`, protected by this ServicePerimeter that are allowed to be accessed by sources defined in the corresponding IngressFrom. If a single `*` is specified, then access to all resources inside the perimeter are allowed.
     * 
     */
    public Optional<Output<List<String>>> resources() {
        return Optional.ofNullable(this.resources);
    }

    private IngressToArgs() {}

    private IngressToArgs(IngressToArgs $) {
        this.operations = $.operations;
        this.resources = $.resources;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(IngressToArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private IngressToArgs $;

        public Builder() {
            $ = new IngressToArgs();
        }

        public Builder(IngressToArgs defaults) {
            $ = new IngressToArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param operations A list of ApiOperations allowed to be performed by the sources specified in corresponding IngressFrom in this ServicePerimeter.
         * 
         * @return builder
         * 
         */
        public Builder operations(@Nullable Output<List<ApiOperationArgs>> operations) {
            $.operations = operations;
            return this;
        }

        /**
         * @param operations A list of ApiOperations allowed to be performed by the sources specified in corresponding IngressFrom in this ServicePerimeter.
         * 
         * @return builder
         * 
         */
        public Builder operations(List<ApiOperationArgs> operations) {
            return operations(Output.of(operations));
        }

        /**
         * @param operations A list of ApiOperations allowed to be performed by the sources specified in corresponding IngressFrom in this ServicePerimeter.
         * 
         * @return builder
         * 
         */
        public Builder operations(ApiOperationArgs... operations) {
            return operations(List.of(operations));
        }

        /**
         * @param resources A list of resources, currently only projects in the form `projects/`, protected by this ServicePerimeter that are allowed to be accessed by sources defined in the corresponding IngressFrom. If a single `*` is specified, then access to all resources inside the perimeter are allowed.
         * 
         * @return builder
         * 
         */
        public Builder resources(@Nullable Output<List<String>> resources) {
            $.resources = resources;
            return this;
        }

        /**
         * @param resources A list of resources, currently only projects in the form `projects/`, protected by this ServicePerimeter that are allowed to be accessed by sources defined in the corresponding IngressFrom. If a single `*` is specified, then access to all resources inside the perimeter are allowed.
         * 
         * @return builder
         * 
         */
        public Builder resources(List<String> resources) {
            return resources(Output.of(resources));
        }

        /**
         * @param resources A list of resources, currently only projects in the form `projects/`, protected by this ServicePerimeter that are allowed to be accessed by sources defined in the corresponding IngressFrom. If a single `*` is specified, then access to all resources inside the perimeter are allowed.
         * 
         * @return builder
         * 
         */
        public Builder resources(String... resources) {
            return resources(List.of(resources));
        }

        public IngressToArgs build() {
            return $;
        }
    }

}
