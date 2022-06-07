// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.servicedirectory_v1beta1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetEndpointArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetEndpointArgs Empty = new GetEndpointArgs();

    @Import(name="endpointId", required=true)
    private Output<String> endpointId;

    public Output<String> endpointId() {
        return this.endpointId;
    }

    @Import(name="location", required=true)
    private Output<String> location;

    public Output<String> location() {
        return this.location;
    }

    @Import(name="namespaceId", required=true)
    private Output<String> namespaceId;

    public Output<String> namespaceId() {
        return this.namespaceId;
    }

    @Import(name="project")
    private @Nullable Output<String> project;

    public Optional<Output<String>> project() {
        return Optional.ofNullable(this.project);
    }

    @Import(name="serviceId", required=true)
    private Output<String> serviceId;

    public Output<String> serviceId() {
        return this.serviceId;
    }

    private GetEndpointArgs() {}

    private GetEndpointArgs(GetEndpointArgs $) {
        this.endpointId = $.endpointId;
        this.location = $.location;
        this.namespaceId = $.namespaceId;
        this.project = $.project;
        this.serviceId = $.serviceId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetEndpointArgs $;

        public Builder() {
            $ = new GetEndpointArgs();
        }

        public Builder(GetEndpointArgs defaults) {
            $ = new GetEndpointArgs(Objects.requireNonNull(defaults));
        }

        public Builder endpointId(Output<String> endpointId) {
            $.endpointId = endpointId;
            return this;
        }

        public Builder endpointId(String endpointId) {
            return endpointId(Output.of(endpointId));
        }

        public Builder location(Output<String> location) {
            $.location = location;
            return this;
        }

        public Builder location(String location) {
            return location(Output.of(location));
        }

        public Builder namespaceId(Output<String> namespaceId) {
            $.namespaceId = namespaceId;
            return this;
        }

        public Builder namespaceId(String namespaceId) {
            return namespaceId(Output.of(namespaceId));
        }

        public Builder project(@Nullable Output<String> project) {
            $.project = project;
            return this;
        }

        public Builder project(String project) {
            return project(Output.of(project));
        }

        public Builder serviceId(Output<String> serviceId) {
            $.serviceId = serviceId;
            return this;
        }

        public Builder serviceId(String serviceId) {
            return serviceId(Output.of(serviceId));
        }

        public GetEndpointArgs build() {
            $.endpointId = Objects.requireNonNull($.endpointId, "expected parameter 'endpointId' to be non-null");
            $.location = Objects.requireNonNull($.location, "expected parameter 'location' to be non-null");
            $.namespaceId = Objects.requireNonNull($.namespaceId, "expected parameter 'namespaceId' to be non-null");
            $.serviceId = Objects.requireNonNull($.serviceId, "expected parameter 'serviceId' to be non-null");
            return $;
        }
    }

}
