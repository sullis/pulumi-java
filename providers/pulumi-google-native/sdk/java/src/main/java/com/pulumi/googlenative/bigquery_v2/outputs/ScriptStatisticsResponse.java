// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.bigquery_v2.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.bigquery_v2.outputs.ScriptStackFrameResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ScriptStatisticsResponse {
    /**
     * @return Whether this child job was a statement or expression.
     * 
     */
    private final String evaluationKind;
    /**
     * @return Stack trace showing the line/column/procedure name of each frame on the stack at the point where the current evaluation happened. The leaf frame is first, the primary script is last. Never empty.
     * 
     */
    private final List<ScriptStackFrameResponse> stackFrames;

    @CustomType.Constructor
    private ScriptStatisticsResponse(
        @CustomType.Parameter("evaluationKind") String evaluationKind,
        @CustomType.Parameter("stackFrames") List<ScriptStackFrameResponse> stackFrames) {
        this.evaluationKind = evaluationKind;
        this.stackFrames = stackFrames;
    }

    /**
     * @return Whether this child job was a statement or expression.
     * 
     */
    public String evaluationKind() {
        return this.evaluationKind;
    }
    /**
     * @return Stack trace showing the line/column/procedure name of each frame on the stack at the point where the current evaluation happened. The leaf frame is first, the primary script is last. Never empty.
     * 
     */
    public List<ScriptStackFrameResponse> stackFrames() {
        return this.stackFrames;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScriptStatisticsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String evaluationKind;
        private List<ScriptStackFrameResponse> stackFrames;

        public Builder() {
    	      // Empty
        }

        public Builder(ScriptStatisticsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.evaluationKind = defaults.evaluationKind;
    	      this.stackFrames = defaults.stackFrames;
        }

        public Builder evaluationKind(String evaluationKind) {
            this.evaluationKind = Objects.requireNonNull(evaluationKind);
            return this;
        }
        public Builder stackFrames(List<ScriptStackFrameResponse> stackFrames) {
            this.stackFrames = Objects.requireNonNull(stackFrames);
            return this;
        }
        public Builder stackFrames(ScriptStackFrameResponse... stackFrames) {
            return stackFrames(List.of(stackFrames));
        }        public ScriptStatisticsResponse build() {
            return new ScriptStatisticsResponse(evaluationKind, stackFrames);
        }
    }
}
