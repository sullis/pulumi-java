// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.osconfig_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.osconfig_v1.inputs.GcsObjectResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Common configurations for an ExecStep.
 * 
 */
public final class ExecStepConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final ExecStepConfigResponse Empty = new ExecStepConfigResponse();

    /**
     * Defaults to [0]. A list of possible return values that the execution can return to indicate a success.
     * 
     */
    @InputImport(name="allowedSuccessCodes", required=true)
      private final List<Integer> allowedSuccessCodes;

    public List<Integer> getAllowedSuccessCodes() {
        return this.allowedSuccessCodes;
    }

    /**
     * A Cloud Storage object containing the executable.
     * 
     */
    @InputImport(name="gcsObject", required=true)
      private final GcsObjectResponse gcsObject;

    public GcsObjectResponse getGcsObject() {
        return this.gcsObject;
    }

    /**
     * The script interpreter to use to run the script. If no interpreter is specified the script will be executed directly, which will likely only succeed for scripts with [shebang lines] (https://en.wikipedia.org/wiki/Shebang_\(Unix\)).
     * 
     */
    @InputImport(name="interpreter", required=true)
      private final String interpreter;

    public String getInterpreter() {
        return this.interpreter;
    }

    /**
     * An absolute path to the executable on the VM.
     * 
     */
    @InputImport(name="localPath", required=true)
      private final String localPath;

    public String getLocalPath() {
        return this.localPath;
    }

    public ExecStepConfigResponse(
        List<Integer> allowedSuccessCodes,
        GcsObjectResponse gcsObject,
        String interpreter,
        String localPath) {
        this.allowedSuccessCodes = Objects.requireNonNull(allowedSuccessCodes, "expected parameter 'allowedSuccessCodes' to be non-null");
        this.gcsObject = Objects.requireNonNull(gcsObject, "expected parameter 'gcsObject' to be non-null");
        this.interpreter = Objects.requireNonNull(interpreter, "expected parameter 'interpreter' to be non-null");
        this.localPath = Objects.requireNonNull(localPath, "expected parameter 'localPath' to be non-null");
    }

    private ExecStepConfigResponse() {
        this.allowedSuccessCodes = List.of();
        this.gcsObject = null;
        this.interpreter = null;
        this.localPath = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExecStepConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<Integer> allowedSuccessCodes;
        private GcsObjectResponse gcsObject;
        private String interpreter;
        private String localPath;

        public Builder() {
    	      // Empty
        }

        public Builder(ExecStepConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedSuccessCodes = defaults.allowedSuccessCodes;
    	      this.gcsObject = defaults.gcsObject;
    	      this.interpreter = defaults.interpreter;
    	      this.localPath = defaults.localPath;
        }

        public Builder setAllowedSuccessCodes(List<Integer> allowedSuccessCodes) {
            this.allowedSuccessCodes = Objects.requireNonNull(allowedSuccessCodes);
            return this;
        }

        public Builder setGcsObject(GcsObjectResponse gcsObject) {
            this.gcsObject = Objects.requireNonNull(gcsObject);
            return this;
        }

        public Builder setInterpreter(String interpreter) {
            this.interpreter = Objects.requireNonNull(interpreter);
            return this;
        }

        public Builder setLocalPath(String localPath) {
            this.localPath = Objects.requireNonNull(localPath);
            return this;
        }
        public ExecStepConfigResponse build() {
            return new ExecStepConfigResponse(allowedSuccessCodes, gcsObject, interpreter, localPath);
        }
    }
}