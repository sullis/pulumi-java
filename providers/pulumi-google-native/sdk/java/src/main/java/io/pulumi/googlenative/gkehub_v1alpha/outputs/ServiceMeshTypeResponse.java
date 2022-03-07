// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gkehub_v1alpha.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ServiceMeshTypeResponse {
    /**
     * A 7 character code matching `^IST[0-9]{4}$` or `^ASM[0-9]{4}$`, intended to uniquely identify the message type. (e.g. "IST0001" is mapped to the "InternalError" message type.)
     * 
     */
    private final String code;
    /**
     * A human-readable name for the message type. e.g. "InternalError", "PodMissingProxy". This should be the same for all messages of the same type. (This corresponds to the `name` field in open-source Istio.)
     * 
     */
    private final String displayName;

    @OutputCustomType.Constructor({"code","displayName"})
    private ServiceMeshTypeResponse(
        String code,
        String displayName) {
        this.code = Objects.requireNonNull(code);
        this.displayName = Objects.requireNonNull(displayName);
    }

    /**
     * A 7 character code matching `^IST[0-9]{4}$` or `^ASM[0-9]{4}$`, intended to uniquely identify the message type. (e.g. "IST0001" is mapped to the "InternalError" message type.)
     * 
    */
    public String getCode() {
        return this.code;
    }
    /**
     * A human-readable name for the message type. e.g. "InternalError", "PodMissingProxy". This should be the same for all messages of the same type. (This corresponds to the `name` field in open-source Istio.)
     * 
    */
    public String getDisplayName() {
        return this.displayName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceMeshTypeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String code;
        private String displayName;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceMeshTypeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.displayName = defaults.displayName;
        }

        public Builder setCode(String code) {
            this.code = Objects.requireNonNull(code);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public ServiceMeshTypeResponse build() {
            return new ServiceMeshTypeResponse(code, displayName);
        }
    }
}