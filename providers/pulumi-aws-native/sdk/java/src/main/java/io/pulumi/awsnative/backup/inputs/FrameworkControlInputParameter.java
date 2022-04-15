// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.backup.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class FrameworkControlInputParameter extends io.pulumi.resources.InvokeArgs {

    public static final FrameworkControlInputParameter Empty = new FrameworkControlInputParameter();

    @Import(name="parameterName", required=true)
      private final String parameterName;

    public String parameterName() {
        return this.parameterName;
    }

    @Import(name="parameterValue", required=true)
      private final String parameterValue;

    public String parameterValue() {
        return this.parameterValue;
    }

    public FrameworkControlInputParameter(
        String parameterName,
        String parameterValue) {
        this.parameterName = Objects.requireNonNull(parameterName, "expected parameter 'parameterName' to be non-null");
        this.parameterValue = Objects.requireNonNull(parameterValue, "expected parameter 'parameterValue' to be non-null");
    }

    private FrameworkControlInputParameter() {
        this.parameterName = null;
        this.parameterValue = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FrameworkControlInputParameter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String parameterName;
        private String parameterValue;

        public Builder() {
    	      // Empty
        }

        public Builder(FrameworkControlInputParameter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.parameterName = defaults.parameterName;
    	      this.parameterValue = defaults.parameterValue;
        }

        public Builder parameterName(String parameterName) {
            this.parameterName = Objects.requireNonNull(parameterName);
            return this;
        }
        public Builder parameterValue(String parameterValue) {
            this.parameterValue = Objects.requireNonNull(parameterValue);
            return this;
        }        public FrameworkControlInputParameter build() {
            return new FrameworkControlInputParameter(parameterName, parameterValue);
        }
    }
}
