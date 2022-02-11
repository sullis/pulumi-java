// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.refactorspaces.inputs;

import io.pulumi.awsnative.refactorspaces.enums.RouteActivationState;
import io.pulumi.awsnative.refactorspaces.enums.RouteMethod;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RouteUriPathRouteInputArgs extends io.pulumi.resources.ResourceArgs {

    public static final RouteUriPathRouteInputArgs Empty = new RouteUriPathRouteInputArgs();

    @InputImport(name="activationState", required=true)
    private final Input<RouteActivationState> activationState;

    public Input<RouteActivationState> getActivationState() {
        return this.activationState;
    }

    @InputImport(name="includeChildPaths")
    private final @Nullable Input<Boolean> includeChildPaths;

    public Input<Boolean> getIncludeChildPaths() {
        return this.includeChildPaths == null ? Input.empty() : this.includeChildPaths;
    }

    @InputImport(name="methods")
    private final @Nullable Input<List<RouteMethod>> methods;

    public Input<List<RouteMethod>> getMethods() {
        return this.methods == null ? Input.empty() : this.methods;
    }

    @InputImport(name="sourcePath")
    private final @Nullable Input<String> sourcePath;

    public Input<String> getSourcePath() {
        return this.sourcePath == null ? Input.empty() : this.sourcePath;
    }

    public RouteUriPathRouteInputArgs(
        Input<RouteActivationState> activationState,
        @Nullable Input<Boolean> includeChildPaths,
        @Nullable Input<List<RouteMethod>> methods,
        @Nullable Input<String> sourcePath) {
        this.activationState = Objects.requireNonNull(activationState, "expected parameter 'activationState' to be non-null");
        this.includeChildPaths = includeChildPaths;
        this.methods = methods;
        this.sourcePath = sourcePath;
    }

    private RouteUriPathRouteInputArgs() {
        this.activationState = Input.empty();
        this.includeChildPaths = Input.empty();
        this.methods = Input.empty();
        this.sourcePath = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouteUriPathRouteInputArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<RouteActivationState> activationState;
        private @Nullable Input<Boolean> includeChildPaths;
        private @Nullable Input<List<RouteMethod>> methods;
        private @Nullable Input<String> sourcePath;

        public Builder() {
    	      // Empty
        }

        public Builder(RouteUriPathRouteInputArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activationState = defaults.activationState;
    	      this.includeChildPaths = defaults.includeChildPaths;
    	      this.methods = defaults.methods;
    	      this.sourcePath = defaults.sourcePath;
        }

        public Builder setActivationState(Input<RouteActivationState> activationState) {
            this.activationState = Objects.requireNonNull(activationState);
            return this;
        }

        public Builder setActivationState(RouteActivationState activationState) {
            this.activationState = Input.of(Objects.requireNonNull(activationState));
            return this;
        }

        public Builder setIncludeChildPaths(@Nullable Input<Boolean> includeChildPaths) {
            this.includeChildPaths = includeChildPaths;
            return this;
        }

        public Builder setIncludeChildPaths(@Nullable Boolean includeChildPaths) {
            this.includeChildPaths = Input.ofNullable(includeChildPaths);
            return this;
        }

        public Builder setMethods(@Nullable Input<List<RouteMethod>> methods) {
            this.methods = methods;
            return this;
        }

        public Builder setMethods(@Nullable List<RouteMethod> methods) {
            this.methods = Input.ofNullable(methods);
            return this;
        }

        public Builder setSourcePath(@Nullable Input<String> sourcePath) {
            this.sourcePath = sourcePath;
            return this;
        }

        public Builder setSourcePath(@Nullable String sourcePath) {
            this.sourcePath = Input.ofNullable(sourcePath);
            return this;
        }

        public RouteUriPathRouteInputArgs build() {
            return new RouteUriPathRouteInputArgs(activationState, includeChildPaths, methods, sourcePath);
        }
    }
}
