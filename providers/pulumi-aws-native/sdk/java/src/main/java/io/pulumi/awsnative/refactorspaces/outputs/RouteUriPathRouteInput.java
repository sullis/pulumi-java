// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.refactorspaces.outputs;

import io.pulumi.awsnative.refactorspaces.enums.RouteActivationState;
import io.pulumi.awsnative.refactorspaces.enums.RouteMethod;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class RouteUriPathRouteInput {
    private final RouteActivationState activationState;
    private final @Nullable Boolean includeChildPaths;
    private final @Nullable List<RouteMethod> methods;
    private final @Nullable String sourcePath;

    @OutputCustomType.Constructor({"activationState","includeChildPaths","methods","sourcePath"})
    private RouteUriPathRouteInput(
        RouteActivationState activationState,
        @Nullable Boolean includeChildPaths,
        @Nullable List<RouteMethod> methods,
        @Nullable String sourcePath) {
        this.activationState = Objects.requireNonNull(activationState);
        this.includeChildPaths = includeChildPaths;
        this.methods = methods;
        this.sourcePath = sourcePath;
    }

    public RouteActivationState getActivationState() {
        return this.activationState;
    }
    public Optional<Boolean> getIncludeChildPaths() {
        return Optional.ofNullable(this.includeChildPaths);
    }
    public List<RouteMethod> getMethods() {
        return this.methods == null ? List.of() : this.methods;
    }
    public Optional<String> getSourcePath() {
        return Optional.ofNullable(this.sourcePath);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouteUriPathRouteInput defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RouteActivationState activationState;
        private @Nullable Boolean includeChildPaths;
        private @Nullable List<RouteMethod> methods;
        private @Nullable String sourcePath;

        public Builder() {
    	      // Empty
        }

        public Builder(RouteUriPathRouteInput defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activationState = defaults.activationState;
    	      this.includeChildPaths = defaults.includeChildPaths;
    	      this.methods = defaults.methods;
    	      this.sourcePath = defaults.sourcePath;
        }

        public Builder setActivationState(RouteActivationState activationState) {
            this.activationState = Objects.requireNonNull(activationState);
            return this;
        }

        public Builder setIncludeChildPaths(@Nullable Boolean includeChildPaths) {
            this.includeChildPaths = includeChildPaths;
            return this;
        }

        public Builder setMethods(@Nullable List<RouteMethod> methods) {
            this.methods = methods;
            return this;
        }

        public Builder setSourcePath(@Nullable String sourcePath) {
            this.sourcePath = sourcePath;
            return this;
        }

        public RouteUriPathRouteInput build() {
            return new RouteUriPathRouteInput(activationState, includeChildPaths, methods, sourcePath);
        }
    }
}
