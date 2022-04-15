// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.alb.inputs;

import io.pulumi.aws.alb.inputs.GetListenerDefaultActionAuthenticateCognito;
import io.pulumi.aws.alb.inputs.GetListenerDefaultActionAuthenticateOidc;
import io.pulumi.aws.alb.inputs.GetListenerDefaultActionFixedResponse;
import io.pulumi.aws.alb.inputs.GetListenerDefaultActionForward;
import io.pulumi.aws.alb.inputs.GetListenerDefaultActionRedirect;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetListenerDefaultAction extends io.pulumi.resources.InvokeArgs {

    public static final GetListenerDefaultAction Empty = new GetListenerDefaultAction();

    @Import(name="authenticateCognitos", required=true)
      private final List<GetListenerDefaultActionAuthenticateCognito> authenticateCognitos;

    public List<GetListenerDefaultActionAuthenticateCognito> authenticateCognitos() {
        return this.authenticateCognitos;
    }

    @Import(name="authenticateOidcs", required=true)
      private final List<GetListenerDefaultActionAuthenticateOidc> authenticateOidcs;

    public List<GetListenerDefaultActionAuthenticateOidc> authenticateOidcs() {
        return this.authenticateOidcs;
    }

    @Import(name="fixedResponses", required=true)
      private final List<GetListenerDefaultActionFixedResponse> fixedResponses;

    public List<GetListenerDefaultActionFixedResponse> fixedResponses() {
        return this.fixedResponses;
    }

    @Import(name="forwards", required=true)
      private final List<GetListenerDefaultActionForward> forwards;

    public List<GetListenerDefaultActionForward> forwards() {
        return this.forwards;
    }

    @Import(name="order", required=true)
      private final Integer order;

    public Integer order() {
        return this.order;
    }

    @Import(name="redirects", required=true)
      private final List<GetListenerDefaultActionRedirect> redirects;

    public List<GetListenerDefaultActionRedirect> redirects() {
        return this.redirects;
    }

    @Import(name="targetGroupArn", required=true)
      private final String targetGroupArn;

    public String targetGroupArn() {
        return this.targetGroupArn;
    }

    @Import(name="type", required=true)
      private final String type;

    public String type() {
        return this.type;
    }

    public GetListenerDefaultAction(
        List<GetListenerDefaultActionAuthenticateCognito> authenticateCognitos,
        List<GetListenerDefaultActionAuthenticateOidc> authenticateOidcs,
        List<GetListenerDefaultActionFixedResponse> fixedResponses,
        List<GetListenerDefaultActionForward> forwards,
        Integer order,
        List<GetListenerDefaultActionRedirect> redirects,
        String targetGroupArn,
        String type) {
        this.authenticateCognitos = Objects.requireNonNull(authenticateCognitos, "expected parameter 'authenticateCognitos' to be non-null");
        this.authenticateOidcs = Objects.requireNonNull(authenticateOidcs, "expected parameter 'authenticateOidcs' to be non-null");
        this.fixedResponses = Objects.requireNonNull(fixedResponses, "expected parameter 'fixedResponses' to be non-null");
        this.forwards = Objects.requireNonNull(forwards, "expected parameter 'forwards' to be non-null");
        this.order = Objects.requireNonNull(order, "expected parameter 'order' to be non-null");
        this.redirects = Objects.requireNonNull(redirects, "expected parameter 'redirects' to be non-null");
        this.targetGroupArn = Objects.requireNonNull(targetGroupArn, "expected parameter 'targetGroupArn' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private GetListenerDefaultAction() {
        this.authenticateCognitos = List.of();
        this.authenticateOidcs = List.of();
        this.fixedResponses = List.of();
        this.forwards = List.of();
        this.order = null;
        this.redirects = List.of();
        this.targetGroupArn = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetListenerDefaultAction defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetListenerDefaultActionAuthenticateCognito> authenticateCognitos;
        private List<GetListenerDefaultActionAuthenticateOidc> authenticateOidcs;
        private List<GetListenerDefaultActionFixedResponse> fixedResponses;
        private List<GetListenerDefaultActionForward> forwards;
        private Integer order;
        private List<GetListenerDefaultActionRedirect> redirects;
        private String targetGroupArn;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetListenerDefaultAction defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authenticateCognitos = defaults.authenticateCognitos;
    	      this.authenticateOidcs = defaults.authenticateOidcs;
    	      this.fixedResponses = defaults.fixedResponses;
    	      this.forwards = defaults.forwards;
    	      this.order = defaults.order;
    	      this.redirects = defaults.redirects;
    	      this.targetGroupArn = defaults.targetGroupArn;
    	      this.type = defaults.type;
        }

        public Builder authenticateCognitos(List<GetListenerDefaultActionAuthenticateCognito> authenticateCognitos) {
            this.authenticateCognitos = Objects.requireNonNull(authenticateCognitos);
            return this;
        }
        public Builder authenticateCognitos(GetListenerDefaultActionAuthenticateCognito... authenticateCognitos) {
            return authenticateCognitos(List.of(authenticateCognitos));
        }
        public Builder authenticateOidcs(List<GetListenerDefaultActionAuthenticateOidc> authenticateOidcs) {
            this.authenticateOidcs = Objects.requireNonNull(authenticateOidcs);
            return this;
        }
        public Builder authenticateOidcs(GetListenerDefaultActionAuthenticateOidc... authenticateOidcs) {
            return authenticateOidcs(List.of(authenticateOidcs));
        }
        public Builder fixedResponses(List<GetListenerDefaultActionFixedResponse> fixedResponses) {
            this.fixedResponses = Objects.requireNonNull(fixedResponses);
            return this;
        }
        public Builder fixedResponses(GetListenerDefaultActionFixedResponse... fixedResponses) {
            return fixedResponses(List.of(fixedResponses));
        }
        public Builder forwards(List<GetListenerDefaultActionForward> forwards) {
            this.forwards = Objects.requireNonNull(forwards);
            return this;
        }
        public Builder forwards(GetListenerDefaultActionForward... forwards) {
            return forwards(List.of(forwards));
        }
        public Builder order(Integer order) {
            this.order = Objects.requireNonNull(order);
            return this;
        }
        public Builder redirects(List<GetListenerDefaultActionRedirect> redirects) {
            this.redirects = Objects.requireNonNull(redirects);
            return this;
        }
        public Builder redirects(GetListenerDefaultActionRedirect... redirects) {
            return redirects(List.of(redirects));
        }
        public Builder targetGroupArn(String targetGroupArn) {
            this.targetGroupArn = Objects.requireNonNull(targetGroupArn);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetListenerDefaultAction build() {
            return new GetListenerDefaultAction(authenticateCognitos, authenticateOidcs, fixedResponses, forwards, order, redirects, targetGroupArn, type);
        }
    }
}
