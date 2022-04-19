// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.machinelearningservices.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * PyTorch distribution configuration.
 * 
 */
public final class PyTorchResponse extends com.pulumi.resources.InvokeArgs {

    public static final PyTorchResponse Empty = new PyTorchResponse();

    /**
     * Enum to determine the job distribution type.
     * Expected value is 'PyTorch'.
     * 
     */
    @Import(name="distributionType", required=true)
      private final String distributionType;

    public String distributionType() {
        return this.distributionType;
    }

    /**
     * Total process count for the distributed job.
     * 
     */
    @Import(name="processCount")
      private final @Nullable Integer processCount;

    public Optional<Integer> processCount() {
        return this.processCount == null ? Optional.empty() : Optional.ofNullable(this.processCount);
    }

    public PyTorchResponse(
        String distributionType,
        @Nullable Integer processCount) {
        this.distributionType = Codegen.stringProp("distributionType").arg(distributionType).require();
        this.processCount = processCount;
    }

    private PyTorchResponse() {
        this.distributionType = null;
        this.processCount = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PyTorchResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String distributionType;
        private @Nullable Integer processCount;

        public Builder() {
    	      // Empty
        }

        public Builder(PyTorchResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.distributionType = defaults.distributionType;
    	      this.processCount = defaults.processCount;
        }

        public Builder distributionType(String distributionType) {
            this.distributionType = Objects.requireNonNull(distributionType);
            return this;
        }
        public Builder processCount(@Nullable Integer processCount) {
            this.processCount = processCount;
            return this;
        }        public PyTorchResponse build() {
            return new PyTorchResponse(distributionType, processCount);
        }
    }
}
